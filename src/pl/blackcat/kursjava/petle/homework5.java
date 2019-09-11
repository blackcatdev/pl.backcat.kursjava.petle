package pl.blackcat.kursjava.petle;

//Sum of Array

public class homework5 {

	private static int sumOfArray(int[] array) {
		int sum = 0;
		for (int element : array) {
			sum = sum + element;
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] array = new int[]{-2, 0, 7, 9, 20};
		System.out.println(sumOfArray(array));

	}

}
