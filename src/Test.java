
import java.util.ArrayList;
import java.util.Arrays;


public class Test {

    public static void main(String[] args) {
        Player player = new Player("Jugador 1");
        System.out.println(player.hand());

        player.drawCard(new Card("picas", "7", 7));
        System.out.println(player.hand());
        player.drawCard(new Card("diamantes", "reina", 13));
        System.out.println(player.hand());

        System.out.println("Echo " + player.throwCard(0) + ". Me queda: " + player.hand());
        System.out.println("Echo " + player.throwCard(0) + ". Me queda: " + player.hand());

        System.out.println();
        Francesa francesa = new Francesa();
        System.out.println(francesa.cartas);
        francesa.barajar();
        System.out.println(francesa.cartas);
        francesa.reiniciar();
        System.out.println(francesa.cartas);

        System.out.println();
        Espanyola espanyola = new Espanyola();
        System.out.println(espanyola.cartas);
        espanyola.barajar();
        System.out.println(espanyola.cartas);
        espanyola.reiniciar();
        System.out.println(espanyola.cartas);
        
        try{
            Poker poker = new Poker(new ArrayList<>(Arrays.asList(new Player("Pepe"), 
                          new Player("Juán"), new Player("Luís"))));
            Poker poker2 = new Poker(new ArrayList<>(Arrays.asList(new Player("Pepe"), 
                          new Player("Juán"))));
        }catch(IllegalArgumentException ex){
            System.out.println(ex);
        }catch(Exception ex){
            System.out.println(ex + Arrays.toString(ex.getStackTrace()));
        }
    }

}
