package parte2;

public class Teste1 {
    public static void main(String[] args) {
        AlunoDeGraduacao a = new AlunoDeGraduacao();
        a.idade = 18;
        a.nome = "Pedro";
        System.out.printf("Nome: %s, Idade; %d\n", a.nome, a.idade);
    }
}
