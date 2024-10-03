import java.util.Scanner;

public class Sample {
    public static void main(String[] args) throws Exception {
        AreaOfTriangle conversion = new AreaOfTriangle();
        Scanner keyboard = new Scanner(System.in);

        int Go = 1;

        while (Go == 1) { 
            System.out.println("Give me the three sides to determine the perimeter of the triangle");
            double a = keyboard.nextDouble();
            double b = keyboard.nextDouble();
            double c = keyboard.nextDouble();

            System.out.println("The first value is: " + a + " \nThe second value is: " + b + " \nThe third value is: " + c);
            conversion.perimeter(a, b, c);
            conversion.area(a, b, c);

            System.out.println("Do you want to continue? Press 1 to continue or 2 to stop");
            int no = keyboard.nextInt();

            if (no == 2){
                Go = 2;
            }
        }
        keyboard.close();
        
    }
}
