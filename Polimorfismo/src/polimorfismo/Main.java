package polimorfismo;

// Classe main 
public class Main {
    public static void main(String[] args) {
        
        // Criando um professor e um aluno
        Pessoa professor = new Professor("Alan Turing: ");
        Pessoa aluno = new Aluno("Jefferson: ");

        // Mensagens de e-mail
        String mensagemProfessor = "Olá, Jefferson! Você conseguiu executar o código da AC2?";
        String mensagemAluno = "Sim, professor! Consegui tranquilamente com os materiais que você postou. Obrigado!";

        // Enviando e-mails
        professor.enviarEmail(mensagemProfessor + " \n");
        aluno.enviarEmail(mensagemAluno);
    }
}
