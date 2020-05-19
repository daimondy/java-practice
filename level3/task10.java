import java.util.*;

public class task10{
	public static void main(String[] args){
		System.out.println(rightTriangle(145,105,100));
	}

	public static boolean rightTriangle(int a, int b, int c) {
		int[] mass = {a, b, c};
		Arrays.sort(mass);
		return (Math.sqrt(Math.pow(mass[0], 2) + Math.pow(mass[1], 2)) == mass[2]);
	}
}