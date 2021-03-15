package ExercicioSeis;

import java.util.ArrayList;

public class Curso {

	private ArrayList<Aluno> alunos;

	public Curso(String nome, Professor professor) {

		this.alunos = new ArrayList<Aluno>();
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public float calculaMediaTurma() {

		float somaDasMedias = 0;

		for (Aluno aluno : alunos) {
			somaDasMedias = somaDasMedias + aluno.calculaMedia();
		}
		return somaDasMedias / alunos.size();

	}

	public void mediaFinal() {
		System.out.println("A média final da turma é: " + this.calculaMediaTurma());
	}
}
