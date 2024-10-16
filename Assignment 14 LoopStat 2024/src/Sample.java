// Kenji
// Mr Fox
// 10/13/24
// Loopstat

import java.util.Scanner;

public class Sample{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter beginning value: ");
		int a = keyboard.nextInt();
		System.out.println("Enter end value: ");
		int b = keyboard.nextInt();

		Loopstat test = new Loopstat();
		test.setNums(a, b);
		test.stringer();

		keyboard.close();
		
	}
}