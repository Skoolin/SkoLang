import java.io.IOException;

public class ByteCodeTest {
	
	public static void main(String[] args) throws IOException {
        java.nio.file.Files.write(java.nio.file.Paths.get("./duke.txt"), "huhu".getBytes());
	}
}