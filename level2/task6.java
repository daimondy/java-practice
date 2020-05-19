public class task6{
	public static void main(String[] args){
		System.out.println(Fibonacci(12));
	}
	public static int Fibonacci(int a) {
		int b = 0;
		int c = 1;
		int f = 0;
		for(int i=1;i<=a;i++){
			f = b + c;
			b =c ;
			c = f;
		}
		return f; 
	}
}