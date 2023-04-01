public class Card {
    protected static enum Suit {
        CLUBS("frefl"), DIAMONDS("karo"), HEARTS("kier"), SPADES("pik");

        private final String name;

        Suit(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name + "";
        }
    }

    protected static enum Rank {
        NINE(9, "9"),
        TEN(10, "10"),
        JACK(2, "J"),
        QUEEN(3, "Q"),
        KING(4, "K"),
        ACE(1, "A");

        private int rank;
        private String symbol;


        Rank(int rank, String symbol) {
            this.rank = rank;
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return symbol + " - " + rank;
        }
    }

    private Suit suit;
    private Rank rank;

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return suit.toString() + " : " + rank.toString();
    }

}
