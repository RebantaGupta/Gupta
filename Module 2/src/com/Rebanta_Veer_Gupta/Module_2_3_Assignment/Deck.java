package com.Rebanta_Veer_Gupta.Module_2_3_Assignment;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Random;

public class Deck {
    private final LinkedList<Card> cards;

    public Deck(){
        LinkedList<Card>unshuffedDeck = new LinkedList<Card>();
        Suit[] possibleSuits = new Suit[] {Suit.CLUBS, Suit.DIAMOND, Suit.HEARTS, Suit.SPADE};
        Rank[] possibleRanks = new Rank[] {Rank.ACE, Rank.TWO, Rank.THREE, Rank.FOUR, Rank.FIVE,
                Rank.SIX, Rank.SEVEN, Rank.EIGHT, Rank.NINE, Rank.TEN,
                Rank.JACK, Rank.QUEEN, Rank.KING};
        for(Suit suit : possibleSuits){
            for (Rank rank : possibleRanks) {
                unshuffedDeck.add(new Card(suit, rank));
            }
        }

        cards = shuffle(unshuffedDeck);
    }

    private LinkedList<Card> shuffle(LinkedList<Card> cardsToShuffle){
        LinkedList<Card> shuffledCards = new LinkedList<Card>();
        Random r = new Random();
        while (!cardsToShuffle.isEmpty()) {
            int randomIndex = r.nextInt(cardsToShuffle.size());
            shuffledCards.push(cardsToShuffle.remove(randomIndex));
        }
        return shuffledCards;
    }

    private LinkedList<Card> poll(int numOfCardsToPoll){
        if(numOfCardsToPoll > cards.size()){
            return null;
        }

        LinkedList<Card> polledCards = new LinkedList<Card>();
        for(int i=0;i<numOfCardsToPoll; i++){
            polledCards.add(cards.poll());
        }
        return polledCards;
    }

    public LinkedList<Card> pollSeven(){
        return poll(7);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        if(this == obj){
            return true;
        }
        Deck otherDeck = (Deck) obj;
        return Objects.equals(cards, otherDeck.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.cards);
    }

    @Override
    public String toString() {
        return "Created deck:\n"+
                "Cards: "+this.cards;
    }

}