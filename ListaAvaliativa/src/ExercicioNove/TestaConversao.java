package ExercicioNove;

import java.util.Scanner;

public class TestaConversao {

	public static void main(String[] args) {

		System.out.print("Informe um número para ser convertido: ");
		Scanner scanner = new Scanner(System.in);

		int numero = scanner.nextInt();

		System.out.println("A conversão de " + numero + " minutos para segundos é : "
				+ ConversaoDeUnidadeDeTempo.minutosParaSegundos(numero) + " segundos");
		System.out.println("A conversão de " + numero + " horas para minutos é : "
				+ ConversaoDeUnidadeDeTempo.horasParaMinutos(numero) + " minutos");
		System.out.println("A conversão de " + numero + " dias para horas é : "
				+ ConversaoDeUnidadeDeTempo.diasParaHoras(numero) + " horas");
		System.out.println("A conversão de " + numero + " semanaas para dias é: "
				+ ConversaoDeUnidadeDeTempo.semanasParaDias(numero) + " dias");
		System.out.println("A conversão de " + numero + " anos para dias é : "
				+ ConversaoDeUnidadeDeTempo.anosParaDias(numero) + " dias");
		scanner.close();
	}
}