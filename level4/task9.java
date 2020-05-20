public class task9{
	public static void main(String[] args){
		System.out.println(trouble("666789","12345667"));
	}

	public static boolean trouble(String num1, String num2) {
		int c1 = 0;
		int c2 = 0;
		String currentChar = "";

		for (int i = 0; i < num1.length() - 1; i++) {
			currentChar = String.valueOf(num1.charAt(i));
			if (currentChar.equals(String.valueOf(num1.charAt(i + 1)))) 
				c1++;
			else 
				c1 = 0;
			if (c1 == 2) {
				c2 = 0;
				for (int j = 0; j < num2.length(); j++) {
					if (currentChar.equals(String.valueOf(num2.charAt(j)))) 
						c2++;
					else 
						c2 = 0;
					if (c2 == 2) 
						return true;
				}
			}
		}
		return false;
	}
}