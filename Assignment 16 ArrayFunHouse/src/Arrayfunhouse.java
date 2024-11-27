
import java.util.Arrays;
import java.util.Scanner;

public class Arrayfunhouse {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Sample test = new Sample();

        int [] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
        int [] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
        int [] SelectedArray = {};
        
        System.out.println("These are your arrays: ");
        System.out.println(Arrays.toString(one) + "\n" + Arrays.toString(two) + "\n" );

        System.out.println("Which array? 1 or 2");
        int prompt = keyboard.nextInt();

        if (prompt == 1){
            SelectedArray = one;
        }
        else if (prompt == 2){
            SelectedArray = two;
        }
        else{
            System.out.println("Not selected option. DIE");
            System.exit(0);
        }

        System.out.println("Give me a number between # - # to add in the array");
        int pos1 = keyboard.nextInt();
        int pos2 = keyboard.nextInt();

        System.out.println("Give me a number that you think is frequent in the array");
        int num1 = keyboard.nextInt();

        System.out.println("Give me a number that you want gone in the array");
        int num2 = keyboard.nextInt();

        test.SetNums(SelectedArray, pos1, pos2, num1, num2);
        test.Print();
    }
}
