import java.util.Random;

public class Deck {
    private int currCardNum = 24;
    private Card[] allCards = new Card[currCardNum];


    Deck() {
        int i = 0;
        for(Card.Suit s : Card.Suit.values()) {
            for (Card.Rank r: Card.Rank.values()) {
                allCards[i] = new Card(s, r);
                i++;
            }
        }
    }

    public Card deleteLastCard() {
        Card lastCard = allCards[currCardNum-1];
        allCards[currCardNum-1] = null;
        currCardNum--;
        return lastCard;
    }

    void shuffleCards() {
        Random r = new Random();
        int id;
        Card tmpCard;
        for(int i = 0; i < currCardNum; i++) {
            id = (int) Math.floor(r.nextDouble()*currCardNum);
            tmpCard = allCards[id];
            allCards[id] = allCards[i];
            allCards[i] = tmpCard;
        }
    }

    @Override
    public String toString() {
        String toReturn = "";
        for(Card c: allCards) {
            if(c != null) {
                toReturn += c.toString() + "\n";
            }
        }
        return toReturn;
    }
}
