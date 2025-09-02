public class Agua {
    private String tipo;
    private String cor;
    private int profundidade;

    public Agua(String tipo, String cor, int profundidade) {
        this.tipo = tipo;
        this.cor = cor;
        this.profundidade = profundidade;
    }

    public void percorrer(Localidade costa) {
        System.out.println("A água percorre por toda a costa de " + costa.getCidade());
    }
}
