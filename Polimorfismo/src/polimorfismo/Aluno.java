package polimorfismo;

//SubClasse Aluno
class Aluno extends Pessoa {

	 // Construtor que faz a mesma coisa que o da classe Professor
	 Aluno(String nome) {
	     super(nome);
	 }
	
	 // Sobrescrevendo o método para o Aluno
	 @Override
	 public void enviarEmail(String mensagem) {
	     // Usamos o getNome aqui também por causa do nome privado
	     System.out.println("Aluno " + getNome() + " \n" + mensagem);
	 }
}