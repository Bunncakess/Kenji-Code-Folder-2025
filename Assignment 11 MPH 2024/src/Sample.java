//Kenji
// Mr Fox
// 10/3/2024
// Miles converstion

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Give me the rate: ");
        int dist = keyboard.nextInt();

        System.out.println("Give me the hour(s): ");
        int hrs = keyboard.nextInt();

        System.out.println("Give me the minute(s): ");
        int mins = keyboard.nextInt();
        
        Miles conversion = new Miles(dist, hrs, mins);
        
        conversion.calculator();
        conversion.print();
        
        keyboard.close();
    }
}
