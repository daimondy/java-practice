public class Task9{
	public static void main(String[] args){
	int[] c={1,5,9};
	System.out.println(sumOfCubes(c));
	}
	public static int sumOfCubes(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += Math.pow(a[i], 3);
		}
		return sum;
	}
}