public class Barco {
    private String nome;
    private int tamanho;
    private int velocidade;

    public Barco(String nome, int tamanho, int velocidade) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.velocidade = velocidade;
    }

    public void navegar(Localidade destino) {
        System.out.println("O " + nome + " está indo até " + destino.getCidade());
    }

    public String getNome() {
        return nome;
    }
}
