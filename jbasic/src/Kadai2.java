import java.util.Scanner;

public class Kadai2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] settingNum = new int[2];
		int i, j;
		int max = 0;
		
		
		for(i = 0; i < settingNum.length; i++) {
			settingNum[i] = scan.nextInt();
		}
		
		int[] data = new int[settingNum[0]];
		
		for(i = 0; i < settingNum[0]; i++) {
			data[i] = scan.nextInt();
			if(data[i] >= max) {
				max = data[i];
			}
		}
		
		for(i = 0; i < settingNum[0]; i++) {
			System.out.print(i + 1 + ":");
			for(j = 0; j < (max / settingNum[1]); j++) {
				if(j < (data[i]/settingNum[1])) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		
		scan.close();
		
		
	}

}
