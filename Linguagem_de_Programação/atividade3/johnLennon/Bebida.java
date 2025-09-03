public class Bebida {
    private String tipo;
    private int volume;
    private String status;

    public Bebida(String tipo, int volume, String status) {
        this.tipo = tipo;
        this.volume = volume;
        this.status = status;
    }

    public void ingerir(){
        System.out.println("Essa bebida será ingerida por alguém.");
    }

    public String getTipo() {
        return tipo;
    }
}
