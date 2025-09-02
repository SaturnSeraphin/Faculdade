public class Localidade {
    private String tipo;
    private String rua;
    private String cidade;

    public Localidade(String tipo, String rua, String cidade) {
        this.tipo = tipo;
        this.rua = rua;
        this.cidade = cidade;
    }

    public void abrigar(Barco barco, Localidade tipo) {
        System.out.println("O " + tipo.getTipo() + " abriga o " + barco.getNome());
    }

    public String getCidade() {
        return cidade;
    }
    public String getTipo() {
        return tipo;
    }
}
