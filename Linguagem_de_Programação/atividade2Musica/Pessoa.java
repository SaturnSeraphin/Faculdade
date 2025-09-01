public class Pessoa {
    private String nome;
    private int idade;
    private String cidade;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }
    public void cantar(){
            System.out.println(nome + " está cantando sobre o mar.");
    }
}

