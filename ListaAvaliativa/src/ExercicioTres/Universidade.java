package ExercicioTres;

//Fazer um programa com as seguintes características:

//Uma classe chamada Universidade que terá como atributo um nome e terá um método para informar o seu nome.
//Uma classe Pessoa, que terá como atributo seu nome, em que universidade * trabalha e em quando entrou na universidade um método que dirá seu nome e * em que universidade trabalha.
//Relacionar a classe Pessoa para com a classe Universidade. Cada pessoa poderá ser associada a uma Universidade.

public class Universidade {

	private String nomeUniversidade;
	private Pessoa pessoa;

	public void setNomeUniversidade(String nomeUniversidade) {
		this.nomeUniversidade = nomeUniversidade;
	}

	public String getNomeUniversidade() {
		return nomeUniversidade;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

}
