// Kenji
// Mr Fox
// 10/13/24
// Coool Numbers

import java.util.Scanner;


public class Coolnumber {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        Sample test = new Sample();
        String choice;

        do {
        System.out.println("Gimme a number to stop");
        int stop = keyboard.nextInt();

        System.out.println("Gimme a number that is \"COOL\"");
        int iscool = keyboard.nextInt();
        
        test.isCoolNumber(iscool);
        test.CoolnumberStop(stop);
        test.print(iscool, stop);
        
        System.out.println("Do you want to continute? (yes/no) \nMake sure its a yes not anything else.");
        choice = keyboard.next();
        } 
        while (choice.equalsIgnoreCase("yes"));    
        System.out.println("IT HAS BEEN STOPPED");

        keyboard.close();
    }
}

