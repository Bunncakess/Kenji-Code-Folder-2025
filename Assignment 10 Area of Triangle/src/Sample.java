import java.util.Scanner;

public class Sample {
    public static void main(String[] args) throws Exception {
        AreaOfTriangle conversion = new AreaOfTriangle();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me the three sides to determine the perimeter of the triangle");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();

        System.out.println("The first value is: " + a + " \nThe second value is: " + b + " \nThe third value is: " + c);
        conversion.perimeter(a, b, c);
        conversion.semiperimeter(a, b, c);

        
    }
}
