// Kenji
// Mr Fox
// 9/23/24
// Inputs

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("What number?");
        int num = keyboard.nextInt();

        System.out.println("This is its integer form: " + (int) num);
        System.out.println("This is its double form: " + (double) num);


        System.out.println("What 1st number to add?");
        int first = keyboard.nextInt();
        System.out.println("What 2nd number to add?");
        int second = keyboard.nextInt();

        System.out.println("Int: " + (first + second));
        System.out.println("double: " + (double)(first + second));
        
        keyboard.close();
    }
}
