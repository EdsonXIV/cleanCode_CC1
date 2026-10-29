package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Hand {
    List<Card> listOfCards;

    public Hand(List<Card> listOfCards) {
        this.listOfCards = listOfCards;

    }


    public int getHighestScore() {
        Card max = listOfCards.stream()
                .max(Comparator.comparingInt(Card::getValue))
                .orElseThrow();
        return max.weight;
    }

}
