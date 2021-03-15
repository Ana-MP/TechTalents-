package ExercicioNove;

import java.util.Scanner;

public class TestaConversao {

	public static void main(String[] args) {

		System.out.print("Informe um n�mero para ser convertido: ");
		Scanner scanner = new Scanner(System.in);

		int numero = scanner.nextInt();

		System.out.println("A convers�o de " + numero + " minutos para segundos � : "
				+ ConversaoDeUnidadeDeTempo.minutosParaSegundos(numero) + " segundos");
		System.out.println("A convers�o de " + numero + " horas para minutos � : "
				+ ConversaoDeUnidadeDeTempo.horasParaMinutos(numero) + " minutos");
		System.out.println("A convers�o de " + numero + " dias para horas � : "
				+ ConversaoDeUnidadeDeTempo.diasParaHoras(numero) + " horas");
		System.out.println("A convers�o de " + numero + " semanaas para dias �: "
				+ ConversaoDeUnidadeDeTempo.semanasParaDias(numero) + " dias");
		System.out.println("A convers�o de " + numero + " anos para dias � : "
				+ ConversaoDeUnidadeDeTempo.anosParaDias(numero) + " dias");
		scanner.close();
	}
}