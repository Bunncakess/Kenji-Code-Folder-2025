// Kenji
// Mr Fox
// 10/2/24
// FtoC & CtoF

import java.util.Scanner;

public class sample {
    public static void main(String[] args) throws Exception {
        FtoC conversion = new FtoC();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me a Fahrenheit to convert to Celcius");
        int num = keyboard.nextInt();

        System.out.println("Give me a Celcius to convert to Fahrenheit");
        int num2 = keyboard.nextInt();

        conversion.Fahrenheitcalculator(num);
        conversion.Celciuscalculator(num2);

        keyboard.close();
    }
}

