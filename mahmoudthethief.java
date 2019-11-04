import java.util.Scanner;

public class mahmoudthethief {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String[] xxx = sc.nextLine().split(" ");
		int n = Integer.parseInt(xxx[0]);
		int m = Integer.parseInt(xxx[1]);
		String[] aa = sc.nextLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i<n; i++) {
			a[i] = Integer.parseInt(aa[i]);
		}
		aa = sc.nextLine().split(" ");
		int [] b = new int[n];
		for (int i = 0;i<n; i++) {
			b[i] = Integer.parseInt(aa[i]);
		}
		
		
		
	}

}
