package p8_classier_puzzlers.puzzle_75;

import java.util.Random;

public class CoinSide {
    private static Random rnd = new Random();

    public static CoinSide flip() {
        return rnd.nextBoolean() ? Heads.INSTANCE : Tails.INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(flip());
    }
}

class Heads extends CoinSide {
    private Heads() {
    }

    public static final Heads INSTANCE = new Heads();

    public String toString() {
        return "heads";
    }
}

class Tails extends CoinSide {
    private Tails() {
    }

    public static final Tails INSTANCE = new Tails();

    public String toString() {
        return "tails";
    }
}