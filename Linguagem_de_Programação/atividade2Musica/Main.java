//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mar mar = new Mar("azul", 5, 10);
        mar.mudarMare();

        Pessoa joao = new Pessoa("João", 20, "Caçapava");
        joao.cantar();

        Sentimento apreciar = new Sentimento ("apreciação", 10, 60);
        apreciar.expressar();
    }
}
