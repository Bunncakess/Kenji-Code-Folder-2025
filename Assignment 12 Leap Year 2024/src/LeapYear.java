// Kenji
// Mr Fox
// 10/13/24
// LeapYear

public class LeapYear{
    
    public boolean isleapyear(int Year){
        if (Year % 4 != 0){
            return false;
        }
        else if (Year % 100 == 0 && Year % 400 != 0){
            return false;
        }
        return true;
    }

    public void print(int Year){
        if (isleapyear(Year)) {
            System.out.println(Year + " is a leap year");
        }
        else{
            System.out.println(Year + " is NOT a leap year");
        }
    }
}