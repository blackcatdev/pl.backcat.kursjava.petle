package pl.blackcat.kursjava.petle;

import java.util.Arrays;

//simple implementation of Sieve of Eratosthenes
//VER1: Let's start!

public class prime {
	private static void sieve(int max) {
		int[] sieve = new int[max + 1];
		for (int i = 2; i <= max; i++)
			sieve[i] = i;
		//System.out.println(Arrays.toString(sieve));

		for (int i = 2; i <= max; i++) {
			for (int j = i * 2; j <= max; j = j + i) {
				//System.out.print("j= ");
				//System.out.println(j);
				sieve[j] = 0;
			}
		}

		for (int i = 1; i <= max; i++) {
			if (sieve[i] != 0) {

				System.out.print(i);
				System.out.print(", ");


			}
		}


	}

	public static void main(String[] args) {
		int max = 50;
		sieve(max);

	}
}
