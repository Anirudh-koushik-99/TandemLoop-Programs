package package1;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		int x = scanner.nextInt();
		int j = 1;
		System.out.print("Output: ");
		if (x % 2 != 0) {
			for (int i = 1; i <= x; i++) {
				System.out.print(j + " ");
				j = j + 2;
			}
		} else {
			x = x - 1;
			for (int i = 1; i <= x; i++) {
				System.out.print(j + " ");
				j = j + 2;
			}
		}
	}
}
