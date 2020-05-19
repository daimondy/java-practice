public class task2{
	public static void main(String[] args){
		int[] a ={44,32,86,19};
		System.out.println(differenceMaxMin(a));
	}
	public static int differenceMaxMin(int[] a) {
		int max=a[1];
		int min=a[1];
		for (int i=0;i<a.length;i++){
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		int razn = max-min;
		return(razn);
	}
}