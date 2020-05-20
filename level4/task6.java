public class task6{
	public static void main(String[] args){
		System.out.println(bugger(39));
	}

	public static int bugger(int num) {
		int chislo = 0;

		while(Integer.valueOf(num).toString().toCharArray().length > 1){
			int new_num = 1;
			for(char c : Integer.valueOf(num).toString().toCharArray()){
				new_num *= Integer.valueOf(String.valueOf(c));
			}
			num = new_num;
			chislo += 1;
		}
		return chislo;
	}
}