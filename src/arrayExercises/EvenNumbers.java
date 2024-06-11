package arrayExercises;

import java.util.Locale;
import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		
		System.out.println("NUMEROS PARES: ");
		int quantidade = 0;
		for (int i = 0; i < n; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d " , vect[i]);
				quantidade ++;
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n" , quantidade);
		
		sc.close();
	}
}
