package jbasic;

import java.util.Scanner;

public class Keyboard2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("苗字を入力してください:");
		String lastName = scan.next();
		
		System.out.println("名前を入力してください:");
		String firstName = scan.next();
		
		System.out.println("あなたのフルネームは" + lastName + firstName + "ですね。");
		
		scan.close();
	}

}
