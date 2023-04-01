import java.util.Scanner;

public class Blackjack {
    private final String name;
    private final Deck deck;
    private int maxIter;
    private int gamerScore;
    private int computScore;


    private Blackjack(Builder builder) {
        name = builder.name;
        deck = builder.deck;
        maxIter = builder.maxIter;
        gamerScore = builder.gamerScore;
        computScore = builder.computScore;
    }

    public static class Builder {
        private final String name;
        private final Deck deck;
        private int maxIter;
        private int gamerScore;
        private int computScore;


        public Builder(String name, Deck deck) {
            this.name = name;
            this.deck = deck;
        }

        public Builder setMaxIter(int maxIter) {
            this.maxIter = maxIter;
            return this;
        }

        public Builder setGamerScore(int gamerScore) {
            this.gamerScore = gamerScore;
            return this;
        }

        public Builder setComputScore(int computScore) {
            this.computScore = computScore;
            return this;
        }

        public Blackjack build() {
            return new Blackjack(this);
        }
    }

    void playBlackjack() {
        System.out.println("1 - PLAY \t 2 - STOP \t 3 - QUIT");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (choice != 3) {
            System.out.println("1 - TAKE CARD \t 2 - STOP \t 3 - QUIT");
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
            }
        }
    }


}

