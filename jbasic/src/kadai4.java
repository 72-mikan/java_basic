import java.util.Scanner;

public class kadai4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h, w;
		int i, j;
		
		h = scan.nextInt();
		w = scan.nextInt();
		
		int[][] data = new int[h][w];
		

		for(i = 0; i < 2; i++) {
			for(j = 0; j < 2; j++) {
				data[i][j] = scan.nextInt();
			}
		}
		
		int hDiff1 = data[1][0] - data[0][0];
		int wDiff1 = data[0][1] - data[0][0];
		
		int hDiff2 = data[1][1] - data[0][1];
		int wDiff2 = data[1][1] - data[1][0];
		
		int diffH = hDiff2 - hDiff1;
		int diffW = wDiff2 - wDiff1;
		
		
		
		
		for(i = 0; i < h; i++) {
			for(j = 0; j < w; j++) {
				if(i == 0 && j == 0) {
					System.out.print(data[0][0]);
				} else if(j == 0) {
					data[i][j] = data[i - 1][0] + hDiff1;
					System.out.print(data[i][j]);
				} else {
					data[i][j] = data[0][j - 1] + wDiff1;
					System.out.print(data[i][j]);
				}
				System.out.println(" ");
			}
			System.out.println();
		}
		
	}

}
