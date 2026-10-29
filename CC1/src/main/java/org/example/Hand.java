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
        List<Card>sorted = listOfCards.stream()
                .sorted(Comparator.comparingInt(Card::getValue).reversed())
                .toList();
        boolean isStraight = true;
        for (int i = 0; i < sorted.size() - 1; i++) {
            if (sorted.get(i).getValue() != sorted.get(i + 1).getValue() + 1) {
                isStraight = false;
                break;
            }
        }

        if(isStraight) return 40;

        for (int i = 0; i <= sorted.size() - 3; i++) {
            if (sorted.get(i) == sorted.get(i + 2)) {
                return 30;
            }
        }

        Card max = listOfCards.stream()
                .max(Comparator.comparingInt(Card::getValue))
                .orElseThrow();
        return max.weight;
    }


}
