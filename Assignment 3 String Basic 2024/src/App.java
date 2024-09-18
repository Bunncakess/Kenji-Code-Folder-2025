//Kenji
//Mr Fox
//Sept 18, 2024
//String basics

public class App {
    public static void main(String[] args) throws Exception {
        
        String message1 = "I am very happy!";
        String target1 = "very ";

        String message2 = "That was great - lol";
        String target2 = "lol";


        //MESSAGE 1
        int pos1 = message1.indexOf(target1);
        String newmessage1 = message1.substring(0, pos1) + message1.substring(pos1 + target1.length());

        System.out.println(newmessage1);


        //MESSAGE 2

        int pos2 = message2.indexOf(target2);
        String newmessage2 = message2.substring(0, pos2) + "laugh out loud";
        System.out.println(newmessage2);
        


    }
}
