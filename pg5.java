import java.util.Scanner;


public class pg5 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
	int[] a=new int[3];
	for(int i=0;i<3;i++){
		a[i]=sc.nextInt();
	}
	for(int i=0;i<3;i++){
	a[i]=round10(a[i]);
	}
	int sum=0;
	for(int i=0;i<3;i++)
		sum=sum+a[i];
	System.out.println(sum);
		

	}
	public static int round10(int i) {
		if(i%10>=5)
			return ((int)(i/10)) * 10 +10;
		else
		return ((int)(i/10)) * 10;
	}
	
}
