package ExercicioDez;

public class TestaCalculadora {

	public static void main(String[] args) {

		Calculadora c = new Calculadora(12, 4);

		c.somar();
		System.out.println("Soma: " + c.getResultado());

		c.subtrair();
		System.out.println("Subtra��o: " + c.getResultado());

		c.multiplicar();
		System.out.println("Multiplica��o: " + c.getResultado());
		c.dividir();
		System.out.println("Divis�o: " + c.getResultado());
		c.elevarPotencia();
		System.out.println("Potencia��o: " + c.getResultado());

	}

}
