
public class Francesa extends Baraja {

	public Francesa() {
		super();
		reiniciar();
	}

	@Override
	void reiniciar() {
		if(cartas.size() != 0) 
			cartas.clear();
		for(String suit: new String[] {"picas", "tréboles", "diamantes", "corazones"})
			for(int i=1; i<14; i++)
				if(i == 11)
					cartas.add(new Card(suit, "J", 10));
				else if(i == 12)
					cartas.add(new Card(suit, "Q", 10));
				else if(i == 13)
					cartas.add(new Card(suit, "K", 10));
				else
					cartas.add(new Card(suit, Integer.toString(i), i));
	}

}
