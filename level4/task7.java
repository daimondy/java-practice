import java.util.*;
import java.lang.*;

public class task7{
	public static void main(String[] args){
		System.out.println(toStarShorthand("7777777geff"));	
	}

	public static String toStarShorthand(String input) {
		String res = "";
		int c = 1;
		Character cchar = new Character('a');

		for (int i = 1; i < input.length(); i++) {
			cchar = input.charAt(i - 1);
			if (cchar == input.charAt(i)) 
				c++;
			else {
				if (c > 1) 
					res += cchar + "*" + c;
				else 
					res += cchar;
				c = 1;
				if (i == input.length() - 1) 
					res += String.valueOf(input.charAt(input.length() - 1));
			}
		}
		if (c != 1) 
			res += cchar + "*" + c;
		return res;
	}
}