import java.util.ArrayList;
import java.util.Random;

/**
 * Created by cristian on 15/05/17.
 */
public class Mazo {

    private ArrayList<Carta> listaCartas;

    public Mazo(){
        this.listaCartas = this.generarCartas();
    }

    private ArrayList<Carta> generarCartas(){
        ArrayList<String> valoresCartas = new ArrayList<String>();
        valoresCartas.add("AS");
        valoresCartas.add("2");
        valoresCartas.add("3");
        valoresCartas.add("4");
        valoresCartas.add("5");
        valoresCartas.add("6");
        valoresCartas.add("7");
        valoresCartas.add("8");
        valoresCartas.add("9");
        valoresCartas.add("J");
        valoresCartas.add("Q");
        valoresCartas.add("K");

        ArrayList<String> tiposCartas = new ArrayList<String>();
        tiposCartas.add("Corazon");
        tiposCartas.add("Pica");
        tiposCartas.add("Diamantes");
        tiposCartas.add("Trebol");

        ArrayList<Carta> listaCartas = new ArrayList<>();

        for (int j = 0; j<tiposCartas.size(); j++){
            for (int i = 0; i<valoresCartas.size(); i++){
                //  System.out.print(tiposCartas.get(j));
                //  System.out.println(" "+valoresCartas.get(i));

                listaCartas.add(new Carta(tiposCartas.get(j),valoresCartas.get(i)));
            }

        }

        return listaCartas;

    }

    public ArrayList<Carta> getMano(){
       ArrayList<Carta> mano = new ArrayList<>();
       for (int i=1;i<=5;i++){
            Random rand = new Random();
            int value = rand.nextInt(this.listaCartas.size());
           mano.add(listaCartas.remove(value)) ;
        }

        return mano;
    }

    public ArrayList<Carta> getListaCartas() {
        return listaCartas;
    }

    public void setListaCartas(ArrayList<Carta> listaCartas) {
        this.listaCartas = listaCartas;
    }
}
