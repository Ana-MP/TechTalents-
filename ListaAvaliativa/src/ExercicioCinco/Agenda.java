package ExercicioCinco;
//Escreva uma classe Agenda 

//contém vários contatos do tipo Contato.
//Cada contato possui nome, telefone e email.
//Agenda também possui um nome.
//Crie métodos que retornam uma String com a informação de cada contato

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
