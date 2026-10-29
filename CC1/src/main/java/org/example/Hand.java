package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Hand {
    List<Card> listOfCards;

    public Hand(List<Card> listOfCards) {
        this.listOfCards = listOfCards.stream()
                .sorted(Comparator.comparingInt(Card::getValue).reversed())
                .toList();

    }


    public int getHighestScore() {

        if(isStraight()) return 40;
        if(isBrelan()) return 30;

        return listOfCards.getFirst().weight;
    }

    private boolean isBrelan(){
        for (int i = 0; i <= listOfCards.size() - 3; i++) {
            if (listOfCards.get(i) == listOfCards.get(i + 2)) {
                return true;
            }
        }
        return false;
    }

    private boolean isStraight(){
        for (int i = 0; i < listOfCards.size() - 1; i++) {
            if (listOfCards.get(i).getValue() != listOfCards.get(i + 1).getValue() + 1) {
                return false;
            }
        }
        return true;
    }
}
