// Kenji
// Mr Fox
// 10/13/24
// Loopstat

public class Loopstat{
	private int start, stop;
	
	public void setNums(int a, int b){
		start = a;
		stop = b;
	}

	public int getEvenCount(){
		int even=0;
		for (int i = 0; i <= stop; i++){
			if (i % 2 == 0){
				even++;
			}
		}
		return even;
	}

	public int getOddCount(){
		int odd=0;
		for (int i = 0; i <= stop; i++){
			if (i % 2 != 0){
				odd++;
			}
		}
		return odd;
	}

	public int getTotal(){
		int total = 0;
        for (int i = start; i <= stop; i++) {
            total += i;
        }
        return total;
	}
	
	public void stringer(){
		System.out.println("/////////////////////////////////RESULTS/////////////////////////////////");
		System.out.println(start + "," + stop); 
		System.out.println("The total is: " + getTotal()); 
		System.out.println("The even count is (including 0): " + getEvenCount()); 
		System.out.println("The odd count is: " + getOddCount()); 

	}
}