import java.util.Scanner;


public class pg6 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		String s=new String(sc.nextLine());
		char[] c=new char[s.length()];
		c=s.toCharArray();
		int sum=0;
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(c[i])){
				String s1=""+c[i];
				sum=sum+Integer.parseInt(s1);
		    }
	    }
		System.out.println(sum);
	
	}

}
