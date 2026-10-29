package org.example;

import java.util.Comparator;
import java.util.List;

public class Hand {
    List<Card> listOfScores;

    public Hand(List<Card> listOfCard) {
        this.listOfScores = listOfCard.stream()
                .sorted(Comparator.comparingInt(Card::getWeight).reversed())
                .toList();

    }


    public int getHighestScore() {

        if(isColor()) return 45;
        if(isStraight()) return 40;
        if(isBrelan()) return 30;

        return listOfScores.getFirst().getWeight();
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
            if (listOfScores.get(i).getWeight() != listOfScores.get(i + 1).getWeight() + 1) {
                return false;
            }
        }
        return true;
    }

    private boolean isColor(){
        for (int i = 0; i < listOfScores.size() - 1; i++) {
            if (listOfScores.get(i).getColor().compareTo(listOfScores.get(i + 1).getColor()) != 0) {
                return false;
            }
        }
        return true;
    }
}
