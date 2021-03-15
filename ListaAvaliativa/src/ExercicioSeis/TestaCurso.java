package ExercicioSeis;

public class TestaCurso {
	public static void main(String[] args) {

		Professor Kagome = new Professor("Kagome Higurasashi", "Artes", "higurashi@hotmail.com");

		Aluno inuyasha = new Aluno("Inuyasha", 3, 2, 10, 1);
		Aluno shipo = new Aluno("Shipo", 6, 7, 8, 9);

		inuyasha.calculaMedia();

		inuyasha.condicaoAluno();

		shipo.calculaMedia();

		shipo.condicaoAluno();

		Curso artes = new Curso("Artes", Kagome);

		artes.setAlunos(inuyasha);

		artes.setAlunos(shipo);

		artes.mediaFinal();

		System.out.println(artes);

	}
}
