package ExercicioCinco;

public class TestaAgenda {

	public static void main(String[] args) {

		Contato contato1 = new Contato("Hermione  Granger ", "34569-98760", "herminoe@gmail.com");
		Contato contato2 = new Contato("Mikasa", "12345-6789", "mikasa@uol.com");
		Contato contato3 = new Contato("Ronald Wesley", "3653-9878", "ronald@bol.com");
		Contato contato4 = new Contato("Kaiu Shirai", "8693-9878", "kaiud@oi.com");
		Agenda agenda = new Agenda();

		agenda.setNomeAgenda(" Ana Maria");
		agenda.setContatos(contato1);
		agenda.setContatos(contato2);
		agenda.setContatos(contato3);
		agenda.setContatos(contato4);

		System.out.println("Nome Agenda: " + agenda.getNomeAgenda() + " - Lista de Contatos : " + agenda.getContatos());
	}

}
