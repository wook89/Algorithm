package chap02;

import java.util.Scanner;

public class AlgoQ16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		npira(num);
	}

	private static void npira(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i - 1; j--) {
				System.out.print("*");

			}
			for (int j = n/n; j<i*2; j++) {
				System.out.print(i % 10);
			}
			System.out.println();

		}
	}

}
