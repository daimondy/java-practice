import java.util.*;

public class task2{
	public static void main(String[] args){
		System.out.println(Arrays.toString(split("((()))(())()()(()())")));
	}

	public static String[] split(String str) {
		List<String> list = new ArrayList<>();
		int sum = 0;
		int ind = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(')
				sum++;
			else
				sum--;
			if (sum == 0) {
				list.add(str.substring(ind, i + 1));
				ind = i + 1;
			}
		}
		String[] strs = new String[list.size()];
		return strs = list.toArray(strs);
	}
}