
import java.util.ArrayList;
import java.util.Collections;

public abstract class Baraja {

    protected ArrayList<Card> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
    }

    void barajar() {  // For derived classes in the same package protected is not necessary  
        Collections.shuffle(cartas);
    }

    Card repartir() throws IndexOutOfBoundsException {
        return cartas.remove(0);
    }

    abstract void reiniciar();
}
