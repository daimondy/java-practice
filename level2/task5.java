public class task5{
	public static void main(String[] args){
		System.out.println(getDecimalPlaces("400"));
	}
	public static int getDecimalPlaces(String a) {
		double b=Double.parseDouble(a);
		b = b%1;
		b = b*10;
		b = Math.floor(b);
		int c = (int) b;
		return c;
	}
}