package parte4;

public class Pessoa {
    private String nome;
    private int idade;
    //getters/setters

    // //construtor padrão da classe Pessoa
    // public Pessoa (){
    //     System.out.println("Pessoa...");
    // }
    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String toString(){
        return String.format(
            "Nome: %s",
            nome
        );
    }
}
