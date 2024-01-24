import java.util.Scanner;

public class kadai6 {

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

	}

}
