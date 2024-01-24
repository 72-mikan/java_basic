import java.util.Scanner;

public class kadai7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int scanData = scan.nextInt();
		
		int digits = Integer.toString(scanData).length();
		int[] dataList = new int[digits];
		
		int tmp = scanData;
		int i, j;
		
		for(i=0; i<digits; i++) {
			dataList[digits-1-i] = tmp % 10;
			tmp = tmp / 10;
		}
		
		String[][] displayBarcode = new String[digits][9];
		int x, y;
		
		for(i=0; i<digits; i++) {
			x = (i % 3) * 3;
			y = (i / 3) * 3;
			displayBarcode = setBarcode(displayBarcode, x, y, dataList[i]);
		}
		
		for(i=0; i<digits; i++) {
			for(j=0; j<9; j++) {
				System.out.print(displayBarcode[i][j]);
			}
			System.out.println();
		}
		
		scan.close();
	}
	
	static String[][] setBarcode(String[][] setData, int x, int y, int data) {
		int i, j;
		int count = 0;
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				if(data != count) {
					setData[y + i][x + j] = "#";
					count++;
				} else {
					setData[y + i][x + j] = ".";
				}
			}
		}
		return setData;
	}


}
