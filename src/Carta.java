/**
 * Created by cristian on 15/05/17.
 */
public class Carta {

    private String tipo;

    private String valor;

    public Carta(String tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carta{" + "tipo ='" + tipo + '\'' + ", valor ='" + valor + '\'' + '}'+"\n";
    }
}
