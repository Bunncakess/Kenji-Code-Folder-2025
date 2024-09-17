import static java.lang.System.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> guns = new ArrayList<>();
        guns.add("ak47");
        guns.add("revolver");
        guns.add("m7");
        guns.add("berreta");

        for (String weapons : guns){
            out.println(weapons);
        }
    }
}
