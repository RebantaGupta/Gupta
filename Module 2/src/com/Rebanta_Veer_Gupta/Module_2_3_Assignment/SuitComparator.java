package com.Rebanta_Veer_Gupta.Module_2_3_Assignment;

import java.util.Comparator;

public class SuitComparator implements Comparator<Card>{

    @Override
    public int compare(Card o1, Card o2) {
        return o1.suit.getValue() - o2.suit.getValue();
    }
}
