import java.util.Scanner;

public class candy {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i<n; i++) {
			int sum = 0;
			String []a = sc.nextLine().split(" ");
			for(int j = 0; j<a.length; j++) {
				sum = sum + Integer.parseInt(a[j]);
			}
			System.out.println(sum/2);
		}
		
	}
}
