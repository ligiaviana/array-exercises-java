package arrayExercises;

import java.util.Locale;
import java.util.Scanner;

public class SumVectors {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();

		int[] vectA = new int[n];
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < n; i++) {
			vectA[i] = sc.nextInt();
		}

		int[] vectB = new int[n];
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < n; i++) {
			vectB[i] = sc.nextInt();
		}

		int[] vectC = new int[n];
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < n; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}

		sc.close();
	}
}
