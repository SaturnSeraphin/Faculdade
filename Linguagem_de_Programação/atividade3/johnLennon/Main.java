public class Main {
    public static void main(String[] args) {
        Especiaria grão = new Especiaria("Café", 500, 200);
        Bebida café = new Bebida("Café", 200, "quente");
        Recipiente caneca = new Recipiente("Caneca", "Branca", 200);


        grão.produzBebida(café);
        café.ingerir();
        caneca.armazernarBebida(café);
    }
}