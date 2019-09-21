
import java.util.ArrayList;

/**
 * Partida de poker
 *
 * @author manuel
 */
public class PartidaPoker {

    static Poker juego;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Player> jugadores = new ArrayList<>();
        String promptCnt = ("Número de jugadores (mínimo 3)");
        String promptPlayer = ("Introduzca el nombre del jugador número ");
        Short cnt = null;
        
        do
            if (cnt != null)
                System.out.print("¡¡NÚMERO MENOR QUE TRES!!");
        while ((cnt = KeyboardInput.getShort(promptCnt)) < 3);
        for (short i = 0; i < cnt; i++)
            jugadores.add(new Player(KeyboardInput.getString(promptPlayer + (i + 1))));
        juego = new Poker(jugadores);
        juego.baraja.barajar();
        for(int i = 0; i<5; i++)
            for(Player player: juego.jugadores)
                if(!juego.baraja.cartas.isEmpty())
                    player.drawCard(juego.baraja.repartir());
        System.out.println(juego);
    }

}
