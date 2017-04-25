import java.util.Scanner;


public class Triplets {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		
		
		sc = new Scanner(System.in);
		String s=sc.nextLine();
		String[] sa=s.split(",");
		
		int[] a=new int[sa.length];
		int i=0;
		while(i<sa.length){
				a[i]=Integer.parseInt(sa[i]);
				i++;
		}
		int flag=0;
		for(i=0;i<sa.length-2;i++){
			if((a[i]==a[i+1] && a[i+1]==a[i+2])){
				flag++;
				break;
			}
			
		}
		if((flag==1))
			System.out.println("false");
		else
			System.out.println("true");
		
}
}
