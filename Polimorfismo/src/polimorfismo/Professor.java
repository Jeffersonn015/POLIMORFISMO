package polimorfismo;

//Classe derivada Professor
class Professor extends Pessoa {

	 // Construtor que passa o nome pro construtor da classe mãe
	 Professor(String nome) {
	     super(nome);
	 }
	
	 // Sobrescrevendo o método para o Professor
	 @Override
	 public void enviarEmail(String mensagem) {
	     // Usamos o getNome porque o nome é privado na classe mãe
	     System.out.println("Prof. " + getNome() + " \n" + mensagem);
	 }
}