import java.util.*;

public class task7{
	public static void main(String[] args){
		System.out.println(isKaprekar(5));
	}

	public static boolean isKaprekar(int x) {
		String res = String.valueOf((int)Math.pow(x, 2));
		int n1, n2;
		if (res.length() == 1) 
			n1 = 0;
		else
			n1 = Integer.parseInt(res.substring(0, (int)(res.length() / 2)));
		n2 = Integer.parseInt(res.substring((int)(res.length() / 2)));
		return (n1 + n2 == x);
	}
}