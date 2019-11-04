import java.util.Arrays;
import java.util.Scanner;

public class D {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		String[] bb = sc.nextLine().split(" ");
		int[] b = new int[a];
		for(int i = 0; i<a; i++) {
			b[i] = Integer.parseInt(bb[i]);
		}
		int c1 = 1;
		for (int c = 2; c<getMax(b);c++) {
			if (isPal(b, c))
				c1 = c;
			
		}
	}
	public static boolean isPal() {
		
	}
	public static int getMax(int[] a) {
		Arrays.sort(a);
		return a[a.length-1];
	}

}
