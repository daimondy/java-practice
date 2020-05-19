import java.util.Scanner;
import static java.lang.Math.*;
import java.util.ArrayList;

public class task1{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Vvedite nomer zadanya");
		int task = scan.nextInt();
		if (task == 1){
			int m = scan.nextInt();
			int d = scan.nextInt();
			int t1 = remainder(m, d);
			System.out.print(t1);
		}
		else if (task==2) {
			double a = scan.nextDouble();
			double h = scan.nextDouble();
			double t2 = triArea(a,h);
			System.out.print(t2);
		}
		else if (task ==3) {
			int chicken = scan.nextInt();
			int cow = scan.nextInt();
			int pig = scan.nextInt();
			int t3 = animals(chicken,cow,pig);
			System.out.print(t3);
		}
		else if (task==4) {
			float prob = scan.nextFloat();
			float prize = scan.nextFloat();
			float pay = scan.nextFloat();
			boolean t4 = profitableGamble(prob,prize,pay);
			System.out.print(t4);
		}
		else if(task==5){
			int n = scan.nextInt();
			int a = scan.nextInt();
			int b = scan.nextInt();
			String t5 = operation(n,a,b);
			System.out.print(t5);
		}
		else if(task==6){

			String n = scan.next();
			int t6 = ctoa(n);
			System.out.print(t6);
		}
		else if(task==7){
			int n = scan.nextInt();
			int t7 = addUpTo(n);
			System.out.print(t7);
		}
		else if(task==8){
			int d1 = scan.nextInt();
			int d2 = scan.nextInt();
			double t8 = nextEdge(d1,d2);
			System.out.print(t8);
		}
		else if(task==10){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			boolean t10 = abcmath(a,b,c);
			System.out.print(t10);
		}

	}
	public static int remainder(int m, int d){ //1 задание
		int ost = m%d;
		return ost;
	}

	public static double triArea(double a, double h){//2 задание
		double ploshad = 0.5*a*h;
		return ploshad;
	}

	public static int animals(int k_ch, int k_cow, int k_pig){//3 задание
		int ch = 2;
		int cow = 4;
		int pig = 4;
		int legs = ch*k_ch+cow*k_cow+pig*k_pig;
		return legs;
	}

	public static Boolean profitableGamble(float prob, float prize, float pay){//4 задание
		if (prob*prize>pay)
			return true;
		else
			return false;
	}

	public static String operation(int n, int a, int b){//5 задание
		String op;
		if (a+b==n)
			op = "Summa";
		else if (a-b==n) 
			op = "Vichitanye";
		else if (a/b==n) 
			op = "Delenie";
		else if (a*b==n) 
			op = "Umnozhenie";
		else
			op ="none";
		return op;
	}

	public static int ctoa(String symbol){//6 задание
		char s = symbol.charAt(0);
		int ascii = (int) s;
		return ascii;
	}

	public static int addUpTo(int n){//7 задание
		ArrayList <Integer> chisla = new ArrayList<>();
		int sum = 0;
		for (int i=1;i<=n;i++){
			chisla.add(i);
			sum = sum + i;
		}
		return sum;
	}

	public static double nextEdge(int d1, int d2){//8 задание
		int d3 = d1+d2-1;
		return d3;
	}
	
	public static boolean abcmath(int a,int b,int c) {//10 задание
		for (int i = 0; i < b; i++) {
			a += a;
		}
		return (a % c == 0);
	}
}