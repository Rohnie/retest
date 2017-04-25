import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class p16 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		
		
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n];
		for(int i=0;i<n;i++)
			s[i]=sc.next();
		HashMap<Character,Character> hm = new HashMap<Character,Character>();
		int i=0;
		while(i<n){
			
				hm.put(s[i].charAt(0),s[i].charAt(s[i].length()-1));
				
			i++;
		}
		Set<Character> set=hm.keySet();
		Iterator<Character> itrk=set.iterator();
		while(itrk.hasNext()){
			Character key=itrk.next();
			System.out.println(key+","+hm.get(key));
		}
	}
	
}
