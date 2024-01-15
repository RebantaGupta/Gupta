package com.Rebanta_Veer_Gupta.Module_2_3_Assignment;

import java.util.Comparator;
public class RankComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        return card1.rank.getValue() - card2.rank.getValue();
    }
}