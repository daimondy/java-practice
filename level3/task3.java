public class task3{
	public static void main(String[] args){
		System.out.println(checkPerfect(496));
	}

	public static boolean checkPerfect(int n){
		int res = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				res += i;
			}
			if (res > n) 
				return false;
		}
		return (res == n);	
	}
}