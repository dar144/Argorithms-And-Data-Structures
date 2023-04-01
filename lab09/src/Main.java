public class Main {
    public static void main(String[] args) {
        Card card1 = new Card(Card.Suit.CLUBS,Card.Rank.ACE);
//        System.out.println(card1);

        Deck deck = new Deck();
//        System.out.println(deck);

        Card deletedCard1 = deck.deleteLastCard();
//        System.out.println(deck);

        deck.shuffleCards();
//        System.out.println(deck);

        Blackjack blackjack = new Blackjack.Builder("ala123", deck).setMaxIter(10).setGamerScore(0).setComputScore(0).build();
        blackjack.playBlackjack();
    }
}