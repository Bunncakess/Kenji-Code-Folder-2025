// Kenji
// Mr Fox
// 10/13/24
// Coool Numbers

public class Sample {
    
    int divs[] = {3, 4, 5, 6};
    int size = divs.length;

    public boolean isCoolNumber(int iscool){

        for (int i = 0; i < size; i++ ){
            if (iscool % divs[i] != 1){
                return false;
            }
        }
        return true;
    }

    public int CoolnumberStop(int stop){
        int count = 0;

        for (int i = 6; i <= stop; i++){
            if (isCoolNumber(i)){
                count++;
            }
        }
        return count;
    }

    public void print(int iscool, int stop){
        System.out.println("There are " + CoolnumberStop(stop) + " cool numbers within " + stop);
        if (isCoolNumber(iscool)){
            System.out.println("Thats a COOL NUMBER. FIND SOME MORE!!!");
            System.out.println("There are: " + CoolnumberStop(stop) + " COOL NUMBERS " + " within the range of " + stop);
        }
        else if(stop < iscool){
            System.out.println("It may be a COOL NUMBER, but its outside of the range you provided. Try AGAIN");
        }
        else{
            System.out.println("It is not a COOL number. Try again.");

        }
    }
    
}