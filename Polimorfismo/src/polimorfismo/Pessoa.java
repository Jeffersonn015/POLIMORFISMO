package polimorfismo;

//SuperClasse  Pessoa
public class Pessoa {
    private String nome;

    // Construtor para definir o nome
    Pessoa(String nome) {
        this.nome = nome;
    }

    // Getter 
    public String getNome() {
        return nome;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método enviarEmail, será sobrescrito nas classes filhas
    public void enviarEmail(String mensagem) {
        // Vai ser implementado nas subclasses, então deixei vazio aqui
    }
}