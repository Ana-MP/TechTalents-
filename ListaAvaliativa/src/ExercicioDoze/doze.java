package ExercicioDoze;

import java.util.Scanner;

public class doze {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int diaSemana = scanner.nextInt();
		System.out.println("Informe um número de 1 a 7, e verifique a qual dia da semana ele se refere");

		switch (diaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Dia da semana invalido, informe um número de 1 a 7");

			scanner.close();

		}

	}

}
