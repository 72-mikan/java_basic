import java.util.Scanner;

public class kadai3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x, y, countryNum;
		
		x = scan.nextInt();
		y = scan.nextInt();
		countryNum = scan.nextInt();
		
		String[] countryList = new String[countryNum];
		int[][] countryPoint = new int[countryNum][2];
		int i, j;
		
		for(i = 0; i < countryNum; i++) {
			countryList[i] = scan.next();
			for(j = 0; j < 2; j++) {
				countryPoint[i][j] = scan.nextInt();
			}
		}
		
		String[][] point = new String[x][y];
		int h, w;
		
		for(i = 0; i < countryNum; i++) {
			h = countryPoint[i][0] - 1;
			w = countryPoint[i][1] - 1;
			point[h][w] = countryList[i];
		}
		
		for(i = 0; i < countryNum; i++) {
			h = countryPoint[i][0] - 1;
			w = countryPoint[i][1] - 1;
			if(h - 1 < 0) {
				point[h - 1][w] = countryList[i];
			}
			if(h + 1 != countryNum) {
				point[h + 1][w] = countryList[i];
			}
			if(w -1 < 0) {
				point[h][w - 1] = countryList[i];
			}
			if(w + 1 < countryNum) {
				point[h][w + 1] = countryList[i];
			}
		}
		
		
		
		for(i = 0; i < x; i++) {
			for(j = 0; j < y; j++) {
				if(point[i][j] != null) {
					System.out.print(point[i][j]);
				} else {
					System.out.print("?");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		scan.close();
	}

}
