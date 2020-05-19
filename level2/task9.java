public class task9{
	public static void main(String[] args){
		System.out.println(isSuffix("vocation", "-logy"));
		System.out.println(isPrefix("automation", "auto-"));
	}
	
	public static boolean isSuffix(String word, String suff){
		suff = suff.replace("-", "");
		int razn = word.length() - suff.length();
		for (int i = razn; i < suff.length(); i++){
			if (suff.charAt(i - razn) == word.charAt(i)){
				continue;
			}
			else
				return false;
		}
		return true;
	}

	public static boolean isPrefix(String word, String pref) {
		pref = pref.replace("-", "");
		for (int i = 0; i < pref.length(); i++){
			if (pref.charAt(i) == word.charAt(i)){
				continue;
			}
			else
				return false;
		}
		return true;
	}
}