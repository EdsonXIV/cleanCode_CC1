package org.example;

public class Card {
    Color color;
    Score score;


    public Card(Color color, Score score) {
        this.color = color;
        this.score = score;
    }

    public int getWeight(){
        return score.getValue();
    }
    public Color getColor(){
        return color;
    }

}
