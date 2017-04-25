import java.util.Scanner;


public class mirror {
private static Scanner sc=new Scanner(System.in);
public static void main(String[] args){
	
	
	sc = new Scanner(System.in);
	String s=sc.nextLine();
	char[] c=new char[s.length()];
	c=s.toCharArray();

StringBuffer s1=new StringBuffer("");
for(int i=0;i<(c.length);i++){
	if(c[i]==c[c.length-(i+1)])
	s1=s1.append(c[i]);
	else
		break;
}
System.out.println(s1);

}
}
