import java.util.Scanner;

public class PieRules {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[60];
		for(int i = 0; i<n; i++)
			a[i] = sc.nextInt();
		int [] dp = new int[60];
		int runningsum = 0;
		dp[n] = 0; 
		for(int i = n-1; i>=0; i--) {
			runningsum = runningsum+a[i];
			dp[i] = Math.max(dp[i+1],runningsum-dp[i+1]);
		}
		System.out.println(runningsum - dp[0] + " " + dp[0]);
	}
}
