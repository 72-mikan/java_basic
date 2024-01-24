import java.util.Scanner;

public class confirm8_3_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
		int max = 0;
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(i+1 + "人目の点数:");
			score[i] = scan.nextInt();
			if(max < score[i]) {
				max = score[i];
			}
		}
		
//		for(int data : score) {
//			if(max < data) {
//				max = data;
//			}
//		}
		
		System.out.println("最高得点は" + max + "です");
	}

}
