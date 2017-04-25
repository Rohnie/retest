import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class p15 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		
		
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n];
		for(int i=0;i<n;i++)
			s[i]=sc.next();
		HashMap<String,Boolean> hm = new HashMap<String,Boolean>();
		int i=0;
		while(i<n){
			if(hm.containsKey(s[i]))
				hm.put(s[i],true);
				else
					hm.put(s[i],false);
			i++;
		}
		Set<String> set=hm.keySet();
		Iterator<String> itrk=set.iterator();
		while(itrk.hasNext()){
			String key=itrk.next();
			System.out.println(key+","+hm.get(key));
		}
	}
		
		
}
