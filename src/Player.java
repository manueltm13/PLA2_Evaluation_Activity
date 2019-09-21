
import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> cards;

    public Player(String name) throws IllegalArgumentException {
        if (name == null)
            throw new IllegalArgumentException("The name is null");
        else if (name.isBlank())
            throw new IllegalArgumentException("The name is blank");
        else {
            setName(name.trim());
            cards = new ArrayList<>();
        }
    }

    /**
     * The player draws a card
     *
     * @param card drawn card
     */
    public void drawCard(Card card) {
        cards.add(card);
    }

    /**
     * The player throws a card
     *
     * @param index card index
     * @return the thrown card
     */
    public Card throwCard(int index) {
        return cards.remove(index);
    }

    public String hand() {
        String str = "[";
        for (Card card : cards)
            if (str.equals("["))
                str += card; // Implicit call toString method
            else
                str += ", " + card;
        str += "]";
        return str;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public final void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", cards=" + hand() + '}';
    }

}
