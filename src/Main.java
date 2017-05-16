import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    Mazo mazo = new Mazo();
    ArrayList<Carta> miMano = mazo.getMano();
        System.out.println(miMano.toString());

        ArrayList<Carta> otraMano = mazo.getMano();
        System.out.println(otraMano.toString());


        System.out.println(mazo.getListaCartas().size());
    }
}
