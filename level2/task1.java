public class task1{
	public static void main(String[] args){
		System.out.println(repeat("hello",7));
	}
	public static String repeat(String a, int repeats) {
		String repeat = "";
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < repeats; j++) {
				repeat += a.charAt(i);
			}
		}
		return repeat;
	}
}