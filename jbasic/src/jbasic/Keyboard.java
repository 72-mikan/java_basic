package jbasic;

import java.util.Scanner;

public class Keyboard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("一つ目の整数を入力してください:");
		int num1 = scan.nextInt();
		
		System.out.print("二つ目の整数を入力してください:");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		System.out.println("入力された値の合計は" + sum + "です。");
		
		scan.close();

	}

}
