
public class Espanyola extends Baraja {

	public Espanyola() {
		super();
		reiniciar();
	}

	@Override
	void reiniciar() {
		if(cartas.size() != 0) 
			cartas.clear();
		for(String suit: new String[] {"espadas", "bastos", "oros", "copas"})
			for(int i=1; i<11; i++)
				if(i == 8)
					cartas.add(new Card(suit, "Sota", 10));
				else if(i == 9)
					cartas.add(new Card(suit, "Caballo", 10));
				else if(i == 10)
					cartas.add(new Card(suit, "Rey", 10));
				else
					cartas.add(new Card(suit, Integer.toString(i), i));
	}

}
