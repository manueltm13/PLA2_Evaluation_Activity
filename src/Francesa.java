
public class Francesa extends Baraja {

    public Francesa() {
        super();
        reiniciar();
    }

    @Override
    final void reiniciar() {
        if (!cartas.isEmpty())
            cartas.clear();
        for (String suit : new String[]{"picas", "tréboles", "diamantes", "corazones"})
            for (int i = 1; i < 14; i++)
                switch (i) {
                    case 11:
                        cartas.add(new Card(suit, "J", 10));
                        break;
                    case 12:
                        cartas.add(new Card(suit, "Q", 10));
                        break;
                    case 13:
                        cartas.add(new Card(suit, "K", 10));
                        break;
                    default:
                        cartas.add(new Card(suit, Integer.toString(i), i));
                        break;
                }
    }

}
