//Kenji
//Mr Fox
//Sept 18, 2024
//Chicken wings

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double chicken = 0.75;
        double money = 4.75;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Each chicken costs $0.75. You have $4.75 in your pockets. How much do you wish to have?");
        int num = keyboard.nextInt();

        double result = chicken * num;
        int amount = (int) result;
        
        if (amount < money){
            System.out.println("You can buy that amount of chicken wings");
        }
        else{
            System.out.println("You do not have the money");
        }
       
        keyboard.close();
    }
}
