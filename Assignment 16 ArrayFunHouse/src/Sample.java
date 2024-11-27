import java.util.Arrays;

public class Sample {

    private int numArray[], start, end, mode, gone;

    public void SetNums(int SelectedArray [], int pos1, int pos2, int num1, int num2){
        numArray = SelectedArray;
        start = pos1;
        end = pos2;
        mode = num1;
        gone = num2;
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

    public int Remove(){
        int removeindex = gone;

        for (int i = 0; i < numArray.length -1;){
            
        }
        return 0;
    }

    public void Print(){
        System.out.println("The sum between " + start + "-" + end + " is " + SumOf() + " in array " + Arrays.toString(numArray));
        System.out.println("# of " + mode + "s = " + ModeOf());
    }
}