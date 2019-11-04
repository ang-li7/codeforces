

import java.util.Scanner;

public class physisits {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		int n = Integer.parseInt(sc.nextLine()); 
		int x = 0; 
		int y = 0; 
		int z = 0; 
		for(int i = 0; i<n; i++) {
			String[]a = sc.nextLine().split(" ");
			x = x + Integer.parseInt(a[0]);
			y = y + Integer.parseInt(a[1]);
			z = z + Integer.parseInt(a[2]);
		}
		if(x == 0 && y == 0 && z == 0) {
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}

}
