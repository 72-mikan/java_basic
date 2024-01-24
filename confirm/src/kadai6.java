import java.util.Scanner;

public class kadai6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quizNum = scan.nextInt();
		
		String[][] quizList = new String[quizNum][2];
		int i, j;
		
		for(i=0; i<quizNum; i++) {
			for(j=0; j<2; j++) {
				quizList[i][j] = scan.next();
			}
		}
		
		boolean[] quizCheck = new boolean[quizNum];
		int count = 0;
		
		for(i=0; i<quizNum; i++) {
			for(j=0; j<2; j++) {
				if(quizList[i][j].equals("n")) {
					quizCheck[i] = false;
					break;
				} else {
					quizCheck[i] = true;
				}
			}
		}
		
		System.out.println(count);
		
		for(i=0; i<quizNum; i++) {
			if(!quizCheck[i]) {
				System.out.println(i + 1);
			}
		}
		
		scan.close();
		
	}

}
