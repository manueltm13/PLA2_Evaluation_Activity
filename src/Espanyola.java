
public class Espanyola extends Baraja {

    public Espanyola() {
        super();
        reiniciar();
    }

    @Override
    final void reiniciar() {
        if (!cartas.isEmpty())
            cartas.clear();
        for (String suit : new String[]{"espadas", "bastos", "oros", "copas"})
            for (int i = 1; i < 11; i++)
                switch (i) {
                    case 8:
                        cartas.add(new Card(suit, "Sota", 10));
                        break;
                    case 9:
                        cartas.add(new Card(suit, "Caballo", 10));
                        break;
                    case 10:
                        cartas.add(new Card(suit, "Rey", 10));
                        break;
                    default:
                        cartas.add(new Card(suit, Integer.toString(i), i));
                        break;
                }
    }

}
