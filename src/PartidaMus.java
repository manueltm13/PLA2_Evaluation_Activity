
/**
 * Partida de mus
 *
 * @author manuel
 */
public class PartidaMus {

    static Mus juego = new Mus();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String prompt = "Introduzca el nombre del jugador número ";

        for (short i = 0; i < 4; i++)
            juego.addJugador(new Player(KeyboardInput.getString(prompt + (i + 1))));
        juego.baraja.barajar();
        for(int i = 0; i<7; i++)
            for(Player player: juego.jugadores)
                if(!juego.baraja.cartas.isEmpty())
                    player.drawCard(juego.baraja.repartir());
        System.out.println(juego);
    }

}
