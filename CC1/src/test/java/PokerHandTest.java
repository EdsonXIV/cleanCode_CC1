import org.example.Card;
import org.example.Hand;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokerHandTest {
    static Card card2;
    static Card card3;
    static Card card4;
    static Card card5;
    static Card card6;
    static Card card7;
    static Card card8;
    static Card card9;
    static Card card10;
    static Card card11;
    static Card card12;
    static Card card13;
    static Card card14;
    static Hand hand1;
    static Hand hand2;

    @BeforeAll
    static void setup(){
        card2 = Card.TWO;
        card3 = Card.THREE;
        card4 = Card.FOUR;
        card5 = Card.FIVE;
        card6 = Card.SIX;
        card7 = Card.SEVEN;
        card8 = Card.EIGHT;
        card9 = Card.NINE;
        card10 = Card.TEN;
        card11 = Card.VALET;
        card12 = Card.QUEEN;
        card13 = Card.KING;
        card14 = Card.AS;

        hand1 = new Hand(List.of(card2,card4,card7,card9,card6));
        hand2 = new Hand(List.of(card2,card2,card2,card5,card6));
    }
    @Test
    void highHandShouldReturn9(){
        assertEquals(9, hand1.getHighestScore());
    }

    @Test
    void brelanShouldReturn30(){
        assertEquals(30, hand2.getHighestScore());
    }

    @Test
    void straightShouldReturn40(){
        Hand hand3 = new Hand(List.of(card2,card3,card4,card5,card6));
        assertEquals(40, hand2.getHighestScore());
    }
}
