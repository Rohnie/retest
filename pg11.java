import java.util.Scanner;


public class pg11 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		
		
		sc = new Scanner(System.in);
		String s=sc.nextLine();
		char[] c=new char[s.length()];
		c=s.toCharArray();
		int count=1;
		for(int i=0;i<(s.length()-1);i++){
			if(c[i]!=c[i+1]){
				count++;
			}
		}
		
		int j=0;
		char[] d=new char[count];
		for(int i=0;i<(s.length()-1);i++){
			if(c[i]!=c[i+1]){
				d[j]=c[i];
				j++;
			}
		}
		if(c[s.length()-2]!=c[s.length()-1]){
			d[j]=c[s.length()-1];
		
		}
		else
			d[j]=c[s.length()-2];
		
		for(int i=0;i<count;i++){
			System.out.print(d[i]);
		}
		

}
}
