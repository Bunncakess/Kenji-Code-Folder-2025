// Kenji
// Mr Fox
// 10/2/24
// Geometry

import java.util.Scanner;

public class Samples {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Type 1 for Perimeter of a Triangle \nType 2 for Surface Area of Cube \nType 3 for Area of a Circle");
        int num = keyboard.nextInt();

        if (num == 1){
            System.out.println("What is the Lenght?");
            double Plenght = keyboard.nextDouble();
            
            System.out.println("What is the Width?");
            double Pwidth = keyboard.nextDouble();
            Geometry.PerimeterCal(Plenght, Pwidth);
        }
        else if (num == 2){
            System.out.println("What is the Edge?");
            double SAedge = keyboard.nextDouble();
            Geometry.CubeCal(SAedge);
        }
        else if (num == 3){
            System.out.println("What is the Radius?");
            double AofCradius = keyboard.nextDouble();
            Geometry.AreaCal(AofCradius);
        }
        else {
            System.out.println("You did not enter the options, die.");
        }
        
        keyboard.close();
    }
}
