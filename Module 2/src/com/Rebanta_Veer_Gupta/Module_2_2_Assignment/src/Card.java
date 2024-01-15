package com.Rebanta_Veer_Gupta.Module_2_2_Assignment.src;

public class Card {
    Suit suit;
    int value;

    String valueStr;

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String toString() {
        if (value == 1) {
            valueStr = "Ace";
        } else if (value == 11) {
            valueStr = "Jack";
        } else if (value == 12) {
            valueStr = "Queen";
        } else if (value == 13) {
            valueStr = "King";
        } else {
            valueStr = String.valueOf(value);
        }
        return valueStr + " of " + suit;
    }
}