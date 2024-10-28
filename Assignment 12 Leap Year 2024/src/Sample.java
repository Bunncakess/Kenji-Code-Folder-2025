// Kenji
// Mr Fox
// 10/13/24
// LeapYear

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        LeapYear test = new LeapYear();

        System.out.println("Give me a year");
        int year = keyboard.nextInt();

        test.isleapyear(year);
        test.print(year);

        keyboard.close();

    }
}
