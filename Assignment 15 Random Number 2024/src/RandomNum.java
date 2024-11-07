import java.util.Random;

public class RandomNum {
    public static void main(String[] args) throws Exception {
        Random ranbo = new Random();
        Sample test = new Sample();
        
        int count = 1;

        for (int i = 1; i < 11; i++ ){
            int a  = ranbo.nextInt(1000);
            int b  = ranbo.nextInt(1000);
            
    
            System.out.println("#" + count + " Here are you two random numbers:\n" + a + " and " + b + "\n");
            test.check(a, b);
            count++;
        }
    }
}
