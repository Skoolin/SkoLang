package de.letsbuildacompiler.compiler;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import de.letsbuildacompiler.parser.DemoLexer;
import de.letsbuildacompiler.parser.DemoParser;
import jasmin.ClassFile;

public class Main {

	private static Path tempDir;
	private static String programName = "code";
	private static String[] programNames = {"std_math", "tester"};
	private static File parentDir;
	private static File currentDir;
	private static String currentProgramName;

	/**
	 * compiles and runs the code written in the code.demo file. creates a
	 * temporary file in temps, which it deletes afterwards.
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		ANTLRInputStream input = new ANTLRFileStream(programName + ".sko");
		System.out.println(run(input));
	}

	/**
	 * compiles the code from the input stream to jasmin assembler code, or
	 * "could not find any code :/", if there isn't any.
	 * 
	 * @param input
	 * @return the compiled jasmin assembly
	 */
	public static String compile(ANTLRInputStream input) {
		DemoLexer lexer = new DemoLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DemoParser parser = new DemoParser(tokens);

		ParseTree tree = parser.program();
		FunctionList definedFunctions = FunctionDefinitionFinder.findFunctions(tree);
		LinkedHashMap<String, TypeModel> types = FunctionDefinitionFinder.findTypes(tree);
		Map<String, StorageModel> statics = FunctionDefinitionFinder.findStatics(tree, types);
		String result = createJasminFile(new MyVisitor(definedFunctions, statics, types, currentProgramName, parentDir, currentDir).visit(tree));
		System.out.println(result);
		return result;
	}

	/**
	 * adds the header to the rest of the instructions
	 * 
	 * @param instructions
	 * @return the compiled jasmin assembly
	 */
	private static String createJasminFile(String instructions) {

		return instructions;

	}

	/**
	 * runs the compiled jasmin code with the Java Virtual Machine (JVM).
	 * 
	 * @param input
	 * @return the output of the program
	 * @throws Exception
	 */
	public static String run(ANTLRInputStream input) throws Exception {
		createTempDir();
		parentDir = tempDir.toFile();
		
		
		for(int pro = 0; pro < programNames.length; pro++) {
			
			ANTLRInputStream testClass = new ANTLRFileStream(programNames[pro] + ".sko");
			String[] split = programNames[pro].split("/");
			currentProgramName = split[split.length-1];
			currentDir = new File(parentDir.getPath(), programNames[pro] + ".sko");
			
			String[] testResult = compile(testClass).split("\\*");

			if (!testResult[0].equals("could not find any code :/")) {
				ClassFile classFile = new ClassFile();
				classFile.readJasmin(new StringReader(testResult[0]), "", false);
				Path outputPath = tempDir.resolve(currentDir.getAbsolutePath().substring(0, currentDir.getAbsolutePath().length() - 4) + ".class");
				classFile.write(Files.newOutputStream(outputPath));

				ClassFile[] extraFiles = new ClassFile[testResult.length - 1];
				for (int i = 0; i < testResult.length - 1; i++) {
					ClassFile file = new ClassFile();
					extraFiles[i] = file;
					file.readJasmin(new StringReader(testResult[i + 1]), "", false);
					Path newPath = tempDir.resolve(file.getClassName() + ".class");
					file.write(Files.newOutputStream(newPath));
				}
			}
		}

		currentProgramName = programName;
		String[] result = compile(input).split("\\*");

		if (!result[0].equals("could not find any code :/")) {
			ClassFile classFile = new ClassFile();
			classFile.readJasmin(new StringReader(result[0]), "", false);
			Path outputPath = tempDir.resolve(classFile.getClassName() + ".class");
			classFile.write(Files.newOutputStream(outputPath));

			ClassFile[] extraFiles = new ClassFile[result.length - 1];
			for (int i = 0; i < result.length - 1; i++) {
				ClassFile file = new ClassFile();
				extraFiles[i] = file;
				file.readJasmin(new StringReader(result[i + 1]), "", false);
				Path newPath = tempDir.resolve(file.getClassName() + ".class");
				file.write(Files.newOutputStream(newPath));
			}

			result[0] = runJavaClass(tempDir, classFile.getClassName());
			deleteTempDir();
			if (result[0] == null) {
				return "";
			}
			return result[0];
		}
		deleteTempDir();
		return "";
	}

	/**
	 * creates the temporal folder for all .class files
	 * 
	 * @throws IOException
	 */
	public static void createTempDir() throws IOException {
		tempDir = Files.createTempDirectory(programName);
//		tempDir.toFile().deleteOnExit();
	}

	/**
	 * deletes all class files and the folder
	 */
	public static void deleteTempDir() {
//		deleteRecursive(tempDir.toFile());
//		tempDir.toFile().delete();
	}

	private static void deleteRecursive(File file) {
		if (file.isDirectory()) {
			for (File child : file.listFiles()) {
				deleteRecursive(child);
			}
		}
		if (!file.delete()) {
			throw new Error("something went wrong, could not delete file");
		}
	}

	/**
	 * runs the bytecode in the given .class file with the JVM.
	 * 
	 * @param dir
	 * @param className
	 * @return
	 * @throws Exception
	 */
	private static String runJavaClass(Path dir, String className) throws Exception {
		Process process = Runtime.getRuntime().exec(new String[] { "java", "-cp", dir.toString(), className });
		try (InputStream in = process.getInputStream()) {
			Scanner scanner = new Scanner(in);
			if (scanner.useDelimiter("\\A").hasNext()) {
				String result = scanner.useDelimiter("\\A").next();
				scanner.close();
				return result;
			}
			scanner.close();
			return null;
		}
	}
}