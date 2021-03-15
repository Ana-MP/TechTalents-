package ExercicioNove;
//Escreva uma classe ConversaoDeUnidadesDeTempo com m�todos est�ticos para convers�o aproximada de velocidade segundo a lista abaixo.

//1 minuto = 60 segundos
//1 hora = 60 minutos
//1 dia = 24 horas
//1 semana = 7 dias
//1 m�s = 30 dias
//1 ano = 365 dias

public class ConversaoDeUnidadeDeTempo {
	static double minutosParaSegundos(double minutos) {
		double segundos = minutos * 60;
		return segundos;
	}

	static double horasParaMinutos(double horas) {
		double minutos = horas * 60;
		return minutos;
	}

	static double diasParaHoras(double dias) {
		double horas = dias * 24;
		return horas;
	}

	static double semanasParaDias(double semanas) {
		double dias = semanas * 7;
		return dias;
	}

	static double mesesParaDias(double meses) {
		double dias = meses * 30;
		return dias;
	}

	static double anosParaDias(double anos) {
		double dias = anos * 365;
		return dias;
	}

}
