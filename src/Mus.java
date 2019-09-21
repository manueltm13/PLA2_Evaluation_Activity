
import java.util.ArrayList;

public class Mus {

    protected final Espanyola baraja;
    protected final ArrayList<Player> jugadores = new ArrayList<>();

    public Mus() {
        baraja = new Espanyola();
    }

    void addJugador(Player player) {
        jugadores.add(player);
    }

    @Override
    public String toString() {
        return "Mus{" + "baraja=" + baraja.cartas + ", \njugadores=" + jugadores + '}';
    }
      
}
