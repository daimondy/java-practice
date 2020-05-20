import java.util.*;

public class task10{
	public static void main(String[] args){
		System.out.println(countUniquebooks("AZYWABBCATTTA", 'A'));
	}

	public static int countUniquebooks(String books, Character end) {
		Map<Character, Boolean> chars = new HashMap<Character, Boolean>();
		boolean analyze = false;
		for (char c: books.toCharArray()) {
			if (analyze && c != end) 
				chars.put(c, true);
			if (c == end) {
				if (analyze) 
					analyze = false;
				else 
					analyze = true;
			}
		}
		return chars.size();
	}
}