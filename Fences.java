import java.util.Scanner;
public class Fences {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt(), K = kb.nextInt();
		int[] fences = new int[N+1];
		for(int i = 0; i < N; i++) fences[i] = kb.nextInt();
		int best = Integer.MAX_VALUE;
		int idx = -1;
		int curSum = 0;
		for(int i = 0; i < K-1; i++) 
			curSum += fences[i];
		for(int i = 0; i <= N-K; i++) {
			curSum += fences[i+K-1];
			if(best > curSum) {
				best = curSum;
				idx = i;
			}
			curSum -= fences[i];
		}
		System.out.println(idx+1);
	} 
}