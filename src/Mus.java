
import java.util.ArrayList;

public class Mus {

    private final Espanyola baraja;
    private ArrayList<Player> jugadores;

    public Mus() {
        baraja = new Espanyola();
    }

    void addJugador(Player player) {
        jugadores.add(player);
    }
}
