package ExercicioDez;

public class Calculadora {
	// Escreva uma classe Calculadora que tenha os métodos cada método recebe dois
	// parâmetros:

	// Somar
	// subtrair
	// multiplicar
	// dividir
	// elevar a potência n.

	private double numero1;
	private double numero2;
	private double resultado;

	public Calculadora(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public void somar() {
		resultado = numero1 + numero2;
	}

	public void subtrair() {
		resultado = numero1 - numero2;
	}

	public void multiplicar() {
		resultado = numero1 * numero2;
	}

	public void dividir() {
		resultado = numero1 / numero2;
	}

	public void elevarPotencia() {
		resultado = Math.pow(numero1, numero2);
	}

	public double getResultado() {

		return resultado;
	}

}
