package arrayExercises;

import java.util.Locale;
import java.util.Scanner;

public class EvenAverage {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		double total = 0.0;
		int quantidade = 0;
		for (int i = 0; i < n; i++) {
			if (vect[i] % 2 == 0) {
				total += vect[i];
				quantidade ++;
			}
		}
		
		double avg = total / quantidade;
		System.out.print("MEDIA DOS PARES = " + avg);
		
		sc.close();

	}

}
