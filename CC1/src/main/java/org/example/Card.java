package org.example;

import java.awt.*;

public class Card {
    Color color;
    Score score;


    public Card(Color color, Score score) {
        this.color = color;
        this.score = score;
    }

    public int getValue(){
        return score.getValue();
    }
}
