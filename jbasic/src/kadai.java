import java.util.Scanner;

public class kadai {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] numList = new int[num];
		int i, j, tmp;
		int total = 0;
		int count = 1;
		
		for(i = 0; i < num; i++) {
			numList[i] = scan.nextInt();
		}
		
		for(i = 0; i < num; i++) {
			for(j = 0; j < num; j++) {
				if(numList[i] < numList[j]) {
					tmp = numList[j];
					numList[j] = numList[i];
					numList[i] = tmp;
				}
			}
		}
		
		if(num == 1) {
			
			total = numList[0];
			
		} else {
			for(i = 1; i < num; i++) {
				if(numList[i - 1] != (numList[i] - 1)) {
					total += numList[i - 1];
				}
				
				if((i+1) == num) {
					total += numList[i];
				}
				
			}
			
		}
		
		System.out.println(total);
		
		scan.close();
	}

}
