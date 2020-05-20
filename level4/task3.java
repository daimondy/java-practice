import java.util.*;

public class task3{
	public static void main(String[] args){
		System.out.println(toSnakeCase("getColor"));
		System.out.println(toCamelCase("get_color"));
	}

	public static String toCamelCase(String str) {
		String []a=str.split("_");
		String new_str=a[0];
		for(int i=1;i<a.length;i++) {
			new_str+=(a[i].substring(0,1).toUpperCase()+a[i].substring(1));
		}	
		return new_str;
	}

	public static String toSnakeCase(String str) {
		String new_str="";
		for(int i=0;i<str.length()-1;i++) {
			if(str.substring(i,i+1).matches("[A-Z]")) {
				new_str=new_str + "_" + str.substring(i,i+1).toLowerCase();
			}else {
				new_str+=str.substring(i,i+1);
			}
		}
		new_str+=str.substring(str.length()-1);
		return new_str;
	}

}