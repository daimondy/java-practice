public class task3{
	public static void main(String[] args){
		 System.out.println(canComplete("butl", "beautiful"));
	}

	private static int OneSimbol(String a,char c){
		int s = 0;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i) == c) s++;
		}
		return s;
	}
	private static boolean canComplete(String a,String b){
		if(a.charAt(0) != b.charAt(0)) return false;
		int k = 0;
		for(char c = 'a';c <= 'z';c++){
			if(kolvoOneSimbol(a,c) > kolvoOneSimbol(b,c)) return false;
		}
		return true;
	}
}