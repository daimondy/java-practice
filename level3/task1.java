import java.lang.Math.*;

public class task1{
	public static void main(String[] args){	
		System.out.println(solutions(1, 0, 1));
	}
	public static int solutions(int a, int b, int c){
		double ur = Math.pow(b, 2) - 4*a*c;
		System.out.print("solutions: ");
		if (ur>0)
			return 2;
		else if (ur==0) 
			return 1;
		else
			return 0;
	}
}