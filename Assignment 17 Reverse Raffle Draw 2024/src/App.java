
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random rand = new Random();
        ArrayList<String> names = new ArrayList<String>();
        Scanner keyboard = new Scanner(System.in);
        boolean torf = true;

        names.add("Kenji");
        names.add("Artur");
        names.add("Richmond");
        names.add("Micheal");
        names.add("Jaylen");
        names.add("William");
        names.add("Anika");
        names.add("Eman");
        names.add("Justine");
        names.add("Jaren");


        System.out.println("THIS IS THE REVERSE RAFFLE DRAW!!! WHOEVER GETS PICKED FROM THE HAT IS ELIMIATED BUT WHOEVER IS THE LAST PERSON IN THE HAT WINS A MILLION DOLLARS!\nThese are your participants: ");
        System.out.println(names);

        System.out.println("Press 1 to draw from the hat or Press 2 to end the draw session early and no one gets the prize!.");
        int prompt = keyboard.nextInt();

        int c = 0;
        for (int i = 10; i > 0; i--){
            c = i;
        }
        
        while(torf == true){
            int randomnames = rand.nextInt(c);

            if (prompt == 1){
                System.out.println(names.get(randomnames) + " Has been removed from the hat!");
                names.remove(randomnames);
                System.out.println(names);
            }
    
        }
    }
}
