package ExercicioSeis;

public class Aluno {

	private String nome;
	private int nota1;
	private int nota2;
	private int nota3;
	private int nota4;

	public Aluno(String nome, int nota1, int nota2, int nota3, int nota4) {

		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}

	public float calculaMedia() {
		return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;

	}

	public void condicaoAluno() {
		if (this.calculaMedia() >= 7) {
			System.out.println(this.nome + " teve uma média igual a " + this.calculaMedia() + " PARABÉNS " + this.nome
					+ " VOCÊ FOI APROVADO");
		} else {
			System.out.println(this.nome + " teve uma média igual a " + this.calculaMedia() + " INFELIZMENTE "
					+ this.nome + "  VOCÊ FOI REPROVADO");
		}

	}

	@Override
	public String toString() {
		return this.nome;

	}
}
