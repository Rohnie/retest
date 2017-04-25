import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class pg14 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		
		
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] key=new String[n];
		String[] value=new String[n];
		for(int i=0;i<n;i++){
			key[i]=sc.next();
			value[i]=sc.next();
		}
		HashMap<String,String> hm = new HashMap<String,String>();
		int i=0;
		while(i<n){
			if(hm.containsKey("a") && hm.containsKey("b")){
				hm.put("ab",hm.get("a")+hm.get("b"));
			
			}
				else
					hm.put(key[i],value[i]);
			i++;
		}
		Set<String> set=hm.keySet();
		Iterator<String> itrk=set.iterator();
		while(itrk.hasNext()){
			String key1=itrk.next();
			System.out.println(key1+","+hm.get(key1));
		}
			
}
}
