package ExercicioTres;

public class TesteUniversidade {
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		Universidade universidade1 = new Universidade();

		universidade1.setPessoa(pessoa1);
		universidade1.getPessoa().setNomePessoa("Ana Maria");
		universidade1.setNomeUniversidade("Universidade Federal de Ouro Preto");

		Pessoa pessoa2 = new Pessoa();
		Universidade universidade2 = new Universidade();

		universidade2.setPessoa(pessoa2);
		universidade2.getPessoa().setNomePessoa("Harry Potter");
		universidade2.setNomeUniversidade("Universidade de  bruxaria de Hogwarts ");

		Pessoa pessoa3 = new Pessoa();
		Universidade universidade3 = new Universidade();
		universidade3.setPessoa(pessoa3);
		universidade3.getPessoa().setNomePessoa("Yusuke Urameshi");
		universidade3.setNomeUniversidade("Universidade  Sarayashiki");

		System.out.println(
				universidade1.getPessoa().getNomePessoa() + " trabalha na " + universidade1.getNomeUniversidade());
		System.out.println(
				universidade2.getPessoa().getNomePessoa() + " trabalha na  " + universidade2.getNomeUniversidade());
		System.out.println(
				universidade3.getPessoa().getNomePessoa() + " trabalha na  " + universidade3.getNomeUniversidade());
	}

}