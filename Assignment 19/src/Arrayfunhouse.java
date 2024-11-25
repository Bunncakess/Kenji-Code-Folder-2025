
import java.util.Arrays;
import java.util.Scanner;

public class Arrayfunhouse {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Sample test = new Sample();

        int [] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
        int [] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};

        test.ArraysWays(one, two);

        System.out.println("These are your arrays: ");
        System.out.println(Arrays.toString(one) + "\n" + Arrays.toString(two) + "\n" );
        System.out.println("Give me a number between # - # to add");
        int start = keyboard.nextInt();
        int end = keyboard.nextInt();

        test.SumOf(start, end);
        test.NewPrint(start, end);
    }
}
