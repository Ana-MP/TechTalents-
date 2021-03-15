package ExercicioOnze;

import java.util.Scanner;
// Escreva um algoritmo que inverta o conteúdo de uma String utilizando uma estrutura de 
//  repetição. O usuário irá entrar com o valor de uma string, por exemplo "ASDFG", e o 
//  programa deverá devolver o seguinte resultado "GFDSA". Dicas: Você irá usar os seguinte 
// métodos ou atributos:
// String.length;
// Para saber o tamanho de uma string
//String.charAt(index); 
// Onde index é o índice que você quer acessar a sting. O indíce de uma string começa sempre 
//  em 0 e termina no tamanho da string -1 (n-1);
//char c='S';  
//String s=String.valueOf(c);
// Para converter um char em String novamente

public class Inverter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite ums palavra: ");

		String Inverter = scanner.nextLine();

		String invertido = "";

		for (int i = Inverter.length() - 1; i >= 0; i--) {
			invertido = invertido + Inverter.charAt(i);
		}

		System.out.println(invertido);

		scanner.close();

	}
}