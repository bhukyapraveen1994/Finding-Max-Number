package maxNumber;

public class FindingMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {10,20,45,5,80,25,40};
		int max = numbers[0];
		for (int i=1; i< numbers.length; i++) {
			if (numbers [i]	> max) {
				max=numbers[i];
			}
		}

		System.out.println("the max number in the array is: " +max);
	}

}
