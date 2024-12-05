import java.util.Arrays;

public class Sample {

    private int numArray[], start, end, mode;

    public void SetNums(int SelectedArray [], int pos1, int pos2, int num1){
        numArray = SelectedArray;
        start = pos1;
        end = pos2;
        mode = num1;
    }
 
    ///SUMMING DEM SUMS////
    public int SumOf(){
        int sum1 = 0;

        for (int i = start; i <= end; i++){

			sum1 += numArray[i];
        }
		return sum1;
	}

    /////GETTING EM MODES

    public int ModeOf(){
        int count = 0;

		for (int i = 0; i < numArray.length ; i++){
			if (numArray[i] == mode){
				count++;
			}
		}
		return count;
	}

    //////removing em and replacing new

    public void Print(){
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("The sum between " + start + "-" + end + " is " + SumOf() + " in array " + Arrays.toString(numArray));
        System.out.println("# of " + mode + "s = " + ModeOf());
    }
}