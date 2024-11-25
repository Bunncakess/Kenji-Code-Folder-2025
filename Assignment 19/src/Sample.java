public class Sample {

    private int first[], second[];

    public void ArraysWays(int one [], int two[]){
        first = one;
        second = two;
    }
    public int SumOf(int start, int end){
        int sum1 = 0;
        for (int i = start; i < end; i++){

			sum1 += first[i];
        }
		return sum1;
	}

    public void ModeOfArray(){
        int count = 0;

    }

    public void WithoutANum(){

    }

    public void NewPrint(int start, int end){
        System.out.println("The sum between position " + start + "-" + end + " = " + SumOf(start, end));
    }
}
