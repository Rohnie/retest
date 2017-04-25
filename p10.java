import java.util.Scanner;


public class p10 {
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
		boolean flag=true;
		while(flag){
			flag=false;
			for(i=0;i<sa.length-1;i++){
			if(a[i]>a[i+1]){
				int t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
				flag=true;
			}
		}
		}
	
		int avg=0;
		int sum=0;
			for(i=1;i<sa.length-1;i++){
				sum=sum+a[i];
			}
			avg=sum/(sa.length-2);
			System.out.println(avg);
		}
	}
	

