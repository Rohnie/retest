import java.util.Scanner;


public class pg8 {
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
		i=0;
		int c=0;
		int p=0;
		while(i<sa.length){
			if(a[i]==0)
				c++;
			i++;
		}
		int[] b=new int[c];
		while(i<sa.length){
			if(a[i]==0){
				b[p]=a[i];
				p++;
			}
		}
		for(i=0;i<c;i++)
			System.out.print(b[i]+",");
		for(i=0;i<sa.length-1;i++){
			if(a[i]!=0)
			System.out.print(a[i]+",");
		}
		if(a[i]!=0)
		System.out.print(a[i]);
		
	}

}
