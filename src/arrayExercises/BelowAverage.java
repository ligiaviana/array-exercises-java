package arrayExercises;

import java.util.Locale;
import java.util.Scanner;

public class BelowAverage {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}

		double total = 0.0;
		for (int i = 0; i < n; i++) {
			total += vect[i];
		}

		double avg = total / n;
		System.out.printf("MEDIA DO VETOR = %.3f%n", avg);

		System.out.println("ELEMENTOS ABAIXO DA MEDIA");
		for (int i = 0; i < n; i++) {
			if (vect[i] < avg) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}

		sc.close();
	}
}
