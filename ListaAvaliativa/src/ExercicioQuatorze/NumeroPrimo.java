package ExercicioQuatorze;

import java.util.Scanner;
/* Escreva um programa que receba um n�mero como entrada e diga se ele � primo ou n�o. */

public class NumeroPrimo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um n�mero e verifique  se ele  � primo: ");
		int numero = scanner.nextInt();
		int contador = 0;

			if (numero < 2) {
			   System.out.println("O n�mero n�o � valido, digite outro");
		    } else {

			for (int i = 1; i <= numero; i++) {

				if ((numero % i) == 0) {
					contador++;
				}
			}
			if (contador == 2) {

				System.out.println("O n�mero " + numero + " � primo.");

			} else {
				System.out.println("O n�mero " + numero + " n�o � primo.");
			}

		}

		scanner.close();

	}
}