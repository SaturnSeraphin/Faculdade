public class Recipiente {
    private String tipo;
    private String cor;
    private int capacidade;

    public Recipiente(String tipo, String cor, int capacidade) {
        this.tipo = tipo;
        this.cor = cor;
        this.capacidade = capacidade;
    }

    public void armazernarBebida(Bebida armazenada){
        System.out.println("A " + tipo + " está armazenando " + armazenada.getTipo());
    }
}
