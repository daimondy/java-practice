import java.util.*;

public class task5{
	public static void main(String[] args){
		System.out.println(isValidHexCode("#EAECEE"));
		System.out.println(isValidHexCode("#CD5C&C"));
	}

	public static boolean isValidHexCode(String s) {
		String[] test = new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "a", "B", "b", "c", "C", "D", "d", "E", "e", "F", "f"};
		List<String> list=Arrays.asList(test);
		Character key=s.charAt(0);
		if((s.length()==7) && key=='#'){	
			for (int i = 1; i < s.length(); i++) {
				if (list.contains(Character.toString(s.charAt(i))))
					continue;
				else
					return false;
			}
			return true;
		}
		return false;
	}
}