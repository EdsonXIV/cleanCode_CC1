package org.example;

public enum Card {
    AS(14),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    VALET(11),
    QUEEN(12),
    KING(13);

    public int weight;

    Card(int weight) {
        this.weight = weight;
    }

}
