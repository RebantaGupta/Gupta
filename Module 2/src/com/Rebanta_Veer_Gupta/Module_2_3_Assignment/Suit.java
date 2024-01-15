package com.Rebanta_Veer_Gupta.Module_2_3_Assignment;

public enum Suit {
    SPADE(1), HEARTS(2), CLUBS(3), DIAMOND(4);

    private int value;

    private  Suit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}