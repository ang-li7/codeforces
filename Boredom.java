import java.util.Scanner;

public class Boredom {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp =new int[10];
		int[] a = new int[10];
		for(int i = 0; i<n; i++) {
			a[sc.nextInt()-1]++;
		}
		for(int x: a) {
			System.out.print(x + " ");
		}
		System.out.println();
		for(int i = n; i>=0; i--) {
			dp[i] = Math.max(dp[i+1], (i+1)*a[i]+dp[i+2]);
			for(int x: dp) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		System.out.println(dp[0]);
	}
	
}
