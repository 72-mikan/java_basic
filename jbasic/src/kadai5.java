import java.util.Scanner;

public class kadai5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h, w;
		h = scan.nextInt();
		w = scan.nextInt();
		System.out.println(h + " " + w);
		
		String[] geoglyph = new String[h];
		
		int i, j;
		
		for(i = 0; i < h; i++) {
			geoglyph[i] = scan.next();
		}
		
		String[][] geoglyphList = new String[h][w];
		
		for(i = 0; i < h; i++) {
			geoglyphList[i] = geoglyph[i].split("");
		}
		
		int count = 0;
		
		for(i = 0; i < h - 3; i++) {
			for(j = 0; j < w - 3; j++) {
				if(check(i, j, geoglyphList)) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
		scan.close();
	}
	
	static boolean check(int a, int b, String[][] data) {
		boolean check = true;
		int i, j;
		for(i = a; i < a + 3; i++) {
			for(j = b; j < b + 3; j++) {
				if((i == a + 1) && (j == b + 1) && !data[i][j].equals(".")) {
					check = false;
				} else if(!data[i][j].equals("#")) {
					check = false;
				}
			}
		}
		return check;
	}

}

