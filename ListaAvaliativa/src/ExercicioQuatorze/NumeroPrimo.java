package ExercicioQuatorze;

import java.util.Scanner;
/* Escreva um programa que receba um número como entrada e diga se ele é primo ou não. */

public class NumeroPrimo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número e verifique  se ele  é primo: ");
		int numero = scanner.nextInt();
		int contador = 0;

			if (numero < 2) {
			   System.out.println("O número não é valido, digite outro");
		    } else {

			for (int i = 1; i <= numero; i++) {

				if ((numero % i) == 0) {
					contador++;
				}
			}
			if (contador == 2) {

				System.out.println("O número " + numero + " é primo.");

			} else {
				System.out.println("O número " + numero + " não é primo.");
			}

		}

		scanner.close();

	}
}