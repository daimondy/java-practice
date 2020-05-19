import java.util.*;
public class task4{
	public static void main(String[] args){
		int[] a={1,2,3};
		System.out.println(Arrays.toString(cumulativeSum(a)));
	}
	public static int[] cumulativeSum(int[] a) {
		int[] mass=new int[a.length];
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
			mass[i]=sum;
		}
		return (mass); 
	}
}