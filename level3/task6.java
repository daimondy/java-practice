import java.util.*;

public class task6{
	public static void main(String[] args){
		int[] a1={2};
		int[] a2={3,3,3,3,3};
		System.out.println(same(a1,a2));
	}

	public static boolean same(int[] a1,int[] a2) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i=0;i<a1.length;i++)
			list1.add(a1[i]);
		for(int i=0;i<a2.length;i++)
			list2.add(a2[i]);
		for(int i=0;i<list1.size();i++){
			for(int j=1;j<a1.length;j++){
				if (a1[i]==a1[j]&&(i!=j))
					list1.remove(i);
			}	
		}	
		for(int i=0;i<list2.size()-1;i++){
			for(int j=1;j<a2.length;j++){
				if (a2[i]==a2[j]&&(i!=j))
					list2.remove(i);
			}	
		}
		if(list1.size()==list2.size())
			return true;
		return false;
	}
}