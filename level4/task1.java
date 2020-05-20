import java.util.*;

public class task1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n, k;

		System.out.print("n: ");
		n = Integer.parseInt(input.nextLine());

		System.out.print("k: ");
		k = Integer.parseInt(input.nextLine());

		System.out.printf("String: ");
		String text = input.nextLine();

		System.out.println(essay(n, k, text));
	}

	public static String essay(int n, int k, String text) {
		String[] words = text.split(" ");
		String s = "";
		String result = "";
		boolean added = false;

		if (n<=100 && k<=80){
			if (n > words.length)
				return "Error. Can't create essay";
			for (int i = 0; i < words.length; i++) {
				String word = words[i];
				if (s.replace(" ", "").length() + word.length() <= k) 
					s += word + " ";
				else {
					result += s + "\n";
					s = word + " ";
				}
			}
			if (s.length() > 0)
				result += s + "\n";
		}
		else
			System.out.printf("Error");
		
		return result;
	}
}

