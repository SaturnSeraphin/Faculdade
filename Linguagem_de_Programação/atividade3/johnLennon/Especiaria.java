public class Especiaria {
    private String nome;
    private int peso;
    private int quantidade;

    public Especiaria(String nome, int peso, int quantidade) {
        this.nome = nome;
        this.peso = peso;
        this.quantidade = quantidade;
    }

    public void produzBebida(Bebida tipoBebida){
        System.out.println("Essa especiaria produz: " + tipoBebida.getTipo());
    }
}
