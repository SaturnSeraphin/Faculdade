public class Main {
    public static void main(String[] args) {
        Barco barco = new Barco("Esperança", 30, 20);
        Localidade porto = new Localidade("Porto","Rua das Ondas", "Lampedusa");
        Agua agua = new Agua("Salgada", "Azul", 200);

        barco.navegar(porto);
        porto.abrigar(barco, porto);
        agua.percorrer(porto);
    }
}
