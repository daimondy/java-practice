public class task8{
	public static void main(String[] args){
		System.out.println(longestZero("100100100"));
	}

	public static String longestZero(String s) {
		int sum = 0;
		int a = 0;
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.toString(s.charAt(i)).equals("0"))
				a++;
			else
				a = 0;
			if (a > sum)
				sum=a;
		}
		for (int i = 0; i < sum; i++)
			res += "0";
		return res;
	}
}