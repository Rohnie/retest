import java.util.Scanner;


public class pg9 {
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
		int o=0;
		int f=0;
		i=0;
		while(i<sa.length){
			if(a[i]==1)
				o++;
			else if(a[i]==4)
				f++;
			i++;
	}
		if(o>f)
			System.out.println(true);
		else
			System.out.println(false);
		
	}
}
