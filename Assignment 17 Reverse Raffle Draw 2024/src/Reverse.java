//Kenji
//Mr Fox
//12/13/2024
//Reverse Raffle Draw
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) throws Exception {
        
        Random rand = new Random();
        ArrayList<String> names = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("give me 10 names to put in the hat. The last one to be drawn out is the winner!");

        while (names.size() <= 9){
            String inputednames = keyboard.nextLine();
            names.add(inputednames);
            
        }
        
        System.out.println("\nThese are the participant's name put in the mystery hat: " + names);

        for (int i = names.size() - 1; i >= 1; i--){
            
            int removenames = rand.nextInt(names.size()-1);

            System.out.println("\nPress 1 to eliminate a participant or 2 to end it early and no ones wins the mysterious prize!");
            int prompt = keyboard.nextInt();

            switch (prompt) {
                case 1:
                    Thread.sleep(1000);
                    System.out.println("///////////////\t" + names.get(removenames) + " has been removed from the hat " + "///////////////\t");
                    names.remove(removenames);
                    break;
                case 2:
                    System.out.println("No one wins!");
                    System.exit(0);
                default:
                    System.out.println("Did not choose any of the options.");
                    System.exit(0);
            }
            
        }

        System.out.println("\nThe Winner Is: " + names + "!!!!!!!!!!!!!!!!!!!!");
        keyboard.close();
    }
}
