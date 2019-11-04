import java.util.Scanner;

public class problemD {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int s=kb.nextInt();
		int b=kb.nextInt();
		int m=kb.nextInt();
		
		int max=(n-1)*b+s;
		int min=(n-1)*s+b;
		
		if(m>=min && m<=max)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}
}