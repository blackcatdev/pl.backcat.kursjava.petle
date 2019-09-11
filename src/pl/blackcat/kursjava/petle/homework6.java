package pl.blackcat.kursjava.petle;

//Sum of 2D Array


public class homework6 {

	private static int sumOf2DArray(int[][] array) {
		int sum = 0;
		for (int[] table1d : array) {
			for (int element : table1d) {
				sum = sum + element;
			}
		}
		return sum;
	}


	public static void main(String[] args) {

		int[][] array = new int[][]
				{
						new int[]{0, 200},
						new int[]{-500, 400},
						new int[]{700, -700},
						new int[]{0, 0}
				};
		System.out.println(sumOf2DArray(array));

	}
}
