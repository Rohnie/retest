import java.util.Scanner;


public class pg4 {
private static Scanner sc=new Scanner(System.in);
public static void main(String[] args){
int[] a=new int[3];
for(int i=0;i<3;i++){
	a[i]=sc.nextInt();
}
int flag=0;
int i=0;
if(Math.abs(a[i]-a[i+1])==0 || Math.abs(a[i]-a[i+1])==1){
	if(Math.abs(a[i+2]-a[i])>=2 && Math.abs(a[i+2]-a[i+1])>=2){
		flag++;
	}
}
if(Math.abs(a[i+1]-a[i+2])==0 || Math.abs(a[i+1]-a[i+2])==1){
	if(Math.abs(a[i]-a[i+1])>=2 && Math.abs(a[i]-a[i+2])>=2){
		flag++;
	}
}
if(Math.abs(a[i]-a[i+2])==0 || Math.abs(a[i]-a[i+2])==1){
		if(Math.abs(a[i+1]-a[i])>=2 && Math.abs(a[i+1]-a[i+2])>=2){
			flag++;
		}
	}
if(flag==1)
	System.out.println("true");
else
	System.out.println("false");

}
}
