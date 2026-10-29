package org.example;

import java.util.Comparator;
import java.util.List;

public class Hand {
    List<Card> listOfScores;

    public Hand(List<Card> listOfCard) {
        this.listOfScores = listOfCard.stream()
                .sorted(Comparator.comparingInt(Card::getValue).reversed())
                .toList();

    }


    public int getHighestScore() {

        if(isStraight()) return 40;
        if(isBrelan()) return 30;

        return listOfScores.getFirst().getValue();
    }

    private boolean isBrelan(){
        for (int i = 0; i <= listOfScores.size() - 3; i++) {
            if (listOfScores.get(i) == listOfScores.get(i + 2)) {
                return true;
            }
        }
        return false;
    }

    private boolean isStraight(){
        for (int i = 0; i < listOfScores.size() - 1; i++) {
            if (listOfScores.get(i).getValue() != listOfScores.get(i + 1).getValue() + 1) {
                return false;
            }
        }
        return true;
    }
}
