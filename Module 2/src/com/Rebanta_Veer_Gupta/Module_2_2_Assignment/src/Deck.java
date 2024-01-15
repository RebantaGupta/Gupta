package com.Rebanta_Veer_Gupta.Module_2_2_Assignment.src;

import java.util.*;

class Deck  {
    private LinkedList<Card> cards;

    public Deck() {
        cards = new LinkedList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        List<Suit> suitList = new ArrayList<>();
        Collections.addAll(suitList, Suit.values());

        Collections.shuffle(suitList, new Random());

        for (Suit suit : suitList) {
            for (int value = 1; value <= 13; value++) {
                cards.add(new Card(suit, value));
                Collections.shuffle(cards, new Random());
            }
        }
    }

    public Card drawCard() {
        if (!cards.isEmpty()) {
            return cards.removeFirst();
        } else {
            System.out.println("The deck is empty!");
            return null;
        }
    }

    public LinkedList<Card> drawHand(int numCards) {
        LinkedList<Card> hand = new LinkedList<>();
        for (int i = 0; i < numCards; i++) {
            Card drawnCard = drawCard();
            if (drawnCard != null) {
                hand.add(drawnCard);
            }
        }
        return hand;
    }
}