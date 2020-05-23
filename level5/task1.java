import java.util.*;

public class task1{
	public static void main(String[] args){ 
		System.out.println(Arrays.toString(encrypt("Sunshine")));
		int[] massive={72, 33, -73, 84, -12, -3, 13, -13, -68}; 
		System.out.println(decrypt(massive));
	}

	private static int[] encrypt(String str){
		int[] a = new int[str.length()];
		a[0] = str.charAt(0);
		for(int i=1;i<str.length();i++){
			 a[i] = (str.charAt(i) - str.charAt(i-1));
		}
		return a;
	}
	private static String decrypt(int[] a){
		String str = "";
		str += (char) a[0];
		for(int i=1;i<a.length;i++){
			int a = str.charAt(i-1);
			str += (char) (a + a[i]);
		}
		return str;
	}
}