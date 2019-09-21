
import java.util.ArrayList;

public class Poker {

    protected final Francesa baraja;
    protected ArrayList<Player> jugadores;

    public Poker(ArrayList<Player> jugadores) throws IllegalArgumentException {
        if (jugadores == null)
            throw new IllegalArgumentException("Los jugadores es un ArrayList nulo");
        else if (jugadores.size() < 3)
            throw new IllegalArgumentException("Menos de tres jugadores");
        else
            this.jugadores = jugadores;
        baraja = new Francesa();
    }

    void addJugador(Player player) {
        jugadores.add(player);
    }

    @Override
    public String toString() {
        return "Poker{" + "baraja=" + baraja.cartas + ", \njugadores=" + jugadores + '}';
    }
    
}
