import java.util.*;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        LinkedList<Card> hand = deck.drawHand(7);

        System.out.println("Drawn Hand:");
        for (Card card : hand) {
            System.out.println(card);
        }
    }
}