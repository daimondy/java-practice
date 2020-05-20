import java.util.*;

public class task4{
	public static void main(String[] args){
		double[] a={16,18,30,1.8};
		System.out.println(overTime(a));	
	}

	public static String overTime(double[] a) {
		double sum=0.0;
		for(double i=a[0]; i<a[1]; i+=0.25){
			if(i<17)
				sum += 0.25 * a[2];
			else if(i>=17)
				sum += 0.25 * a[2] * a[3];
		}
		return String.format("$%.2f", sum);
	}
}