package ExercicioCinco;
//Escreva uma classe Agenda 

//cont�m v�rios contatos do tipo Contato.
//Cada contato possui nome, telefone e email.
//Agenda tamb�m possui um nome.
//Crie m�todos que retornam uma String com a informa��o de cada contato

import java.util.ArrayList;

public class Agenda {

	private String nomeAgenda;
	private ArrayList<Contato> contatos;

	public Agenda() {
		this.contatos = new ArrayList<Contato>();
	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(Contato contatos) {
		this.contatos.add(contatos);
	}

}
