import java.util.Scanner;

public class Sample {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        Miles conversion = new Miles();

        System.out.println("Give me the three sides to determine the perimeter of the triangle");
        double rate = keyboard.nextDouble();
        double hours = keyboard.nextDouble();
        double minutes = keyboard.nextDouble();
        
        System.out.println("The first value is: " + rate + " \nThe second value is: " + hours + " \nThe third value is: " + minutes);
        conversion.distance(rate, hours, minutes);

    }
}
