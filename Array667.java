import java.util.Scanner;


public class Array667 {
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
	int c=0;
	for(i=0;i<sa.length-1;i++){
	if((a[i]==6 && a[i+1]==6)||(a[i]==6 && a[i+1]==7))
		c++;
	}
	System.out.println(c);

}
}
