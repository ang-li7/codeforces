import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class songs {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		long maxSize = kb.nextInt();
		long[] ucSong = new long[num];
		long[] cSong = new long[num];
		long[] diff = new long[num];
		PriorityQueue<Long> maxComp = new PriorityQueue<Long>(Collections.reverseOrder());
		long maxMin = 0;
		long unComp = 0;
		for(int i = 0; i<num; i++) {
			ucSong[i] = kb.nextInt();
			cSong[i] = kb.nextInt();
			diff[i] = ucSong[i] - cSong[i];
			maxMin += cSong[i];
			maxComp.add(diff[i]);
			unComp += ucSong[i];
		}
		if(maxMin > maxSize) {
			System.out.println("-1");
			return;
		}
		int c = 0;
		while(unComp > maxSize) {
			c++;
			long l = maxComp.poll();
			unComp -= l;
		}
		System.out.println(c);
	}
}