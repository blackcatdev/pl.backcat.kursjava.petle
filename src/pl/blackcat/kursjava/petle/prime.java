package pl.blackcat.kursjava.petle;

//simple implementation of Sieve of Eratosthenes
//VER1: Let's start!
//VER2: delete multiplications of 2 - don't need to check them many times, add counter to compare result with WolframAlpha
//VER3: checking primes up to sqrt(n)

import static java.lang.Math.sqrt;

public class prime {
	private static void sieve(int max) {
		//init array + preparations
		int[] sieve = new int[max + 1];
		double sqrt_max = sqrt(max);
		System.out.println(sqrt_max);

		//fill the array
		for (int i = 2; i <= max; i++)
			sieve[i] = i;

		//sieve
		for (int i = 4; i <= max; i=i+2)
			sieve[i] = 0;
		for (int i = 3; i <= sqrt_max; i=i+2) {
			for (int j = i * 2; j <= max; j = j + i) {
				sieve[j] = 0;
/*
				System.out.print("j= ");
				System.out.println(j);
*/
			}
		}

		//print
		int counter = 0;
		for (int i = 1; i <= max; i++) {
			if (sieve[i] != 0) {

				counter++;
				System.out.print(i);
				System.out.println(",");


			}
		}
		System.out.print("Total primes: ");
		System.out.println(counter);


	}

	public static void main(String[] args) {
		int max = 50000;
		sieve(max);

	}
}
