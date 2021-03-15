package ExercicioDez;

public class TestaCalculadora {

	public static void main(String[] args) {

		Calculadora c = new Calculadora(12, 4);

		c.somar();
		System.out.println("Soma: " + c.getResultado());

		c.subtrair();
		System.out.println("Subtração: " + c.getResultado());

		c.multiplicar();
		System.out.println("Multiplicação: " + c.getResultado());
		c.dividir();
		System.out.println("Divisão: " + c.getResultado());
		c.elevarPotencia();
		System.out.println("Potenciação: " + c.getResultado());

	}

}
