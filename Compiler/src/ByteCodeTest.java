public class ByteCodeTest {
	public static void main(String[] args) {
		System.out.println(time());
	}
	
	public static int time() {
		return (int) (System.nanoTime() / 1000000);
	}
}