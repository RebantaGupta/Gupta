package com.Rebanta_Veer_Gupta.Module_2_3_Assignment;

import java.util.Objects;

public class Card {
    Suit suit;
    Rank rank;

    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit(){
        return suit;
    }

    public Rank getRank(){
        return rank;
    }

    public CardType getCardType(){
        if (rank == Rank.JACK || rank == Rank.QUEEN || rank == Rank.KING)
            return CardType.FACE;
        return CardType.NUMBER;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        if (this == obj){
            return true;
        }

        Card otherCard = (Card) obj;
        return (suit == otherCard.suit && rank == otherCard.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }

    @Override
    public String toString() {
        return "Card: ["+
                "Suit: "+suit + ", "+
                "Rank: "+rank + ", "+
                "CardType: "+getCardType()+"]";
    }
}