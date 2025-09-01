public class Sentimento {
    private String tipo;
    private int intensidade;
    private int duracao;

    public Sentimento(String tipo, int intensidade, int duracao) {
        this.tipo = tipo;
        this.intensidade = intensidade;
        this.duracao = duracao;
    }

    public void expressar(){
        System.out.println("O sentimento de "+ tipo + " está sendo expresso.");
    }
}
