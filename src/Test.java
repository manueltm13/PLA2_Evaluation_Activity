
public class Test {

	public static void main(String[] args) {
		Player player =new Player("Jugador 1");
		System.out.println(player.hand());
		
		player.drawCard(new Card("picas", "7", 7));
		System.out.println(player.hand());
		player.drawCard(new Card("diamantes", "reina", 13));
		System.out.println(player.hand());
		
		System.out.println("Echo " + player.throwCard(0) + ". Me queda: " + player.hand());
		System.out.println("Echo " + player.throwCard(0) + ". Me queda: " + player.hand());

	}

}
