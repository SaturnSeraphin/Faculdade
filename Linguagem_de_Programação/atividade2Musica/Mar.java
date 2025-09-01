public class Mar {
    private String cor;
    private int profundidade;
    private int ondas;

    public Mar(String cor, int profundidade, int ondas) {
        this.cor = cor;
        this.profundidade = profundidade;
        this.ondas = ondas;
    }

    public void mudarMare() {
        System.out.println("O mar mudou sua maré e agora está mais calmo.");
    }
}
