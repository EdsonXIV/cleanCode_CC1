import org.example.Card;
import org.example.Color;
import org.example.Score;
import org.example.Hand;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokerHandTest {
    static Score score2;
    static Score score3;
    static Score score4;
    static Score score5;
    static Score score6;
    static Score score7;
    static Score score8;
    static Score score9;
    static Score score10;
    static Score score11;
    static Score score12;
    static Score score13;
    static Score score14;
    static Hand hand1;
    static Hand hand2;

    @BeforeAll
    static void setup(){
        score2 = Score.TWO;
        score3 = Score.THREE;
        score4 = Score.FOUR;
        score5 = Score.FIVE;
        score6 = Score.SIX;
        score7 = Score.SEVEN;
        score8 = Score.EIGHT;
        score9 = Score.NINE;
        score10 = Score.TEN;
        score11 = Score.VALET;
        score12 = Score.QUEEN;
        score13 = Score.KING;
        score14 = Score.AS;



    }
    @Test
    void highHandShouldReturn9(){
        Card card1 = new Card(Color.ACE,score2);
        Card card2 = new Card(Color.ACE,score6);
        Card card3 = new Card(Color.ACE,score8);
        Card card4 = new Card(Color.ACE,score9);
        Card card5 = new Card(Color.ACE,score4);

        hand1 = new Hand(List.of(card1, card2, card4, card5, card3));

        assertEquals(9, hand1.getHighestScore());
    }

    @Test
    void brelanShouldReturn30(){
        Card card1 = new Card(Color.ACE,score2);
        Card card2 = new Card(Color.ACE,score2);
        Card card3 = new Card(Color.ACE,score2);
        Card card4 = new Card(Color.ACE,score9);
        Card card5 = new Card(Color.ACE,score4);
        hand2 = new Hand(List.of(card1, card2, card3, card4, card5));
        assertEquals(30, hand2.getHighestScore());
    }

    @Test
    void straightShouldReturn40(){
        Card card1 = new Card(Color.ACE,score2);
        Card card2 = new Card(Color.ACE,score3);
        Card card3 = new Card(Color.ACE,score4);
        Card card4 = new Card(Color.ACE,score5);
        Card card5 = new Card(Color.ACE,score6);
        Hand hand3 = new Hand(List.of(card1, card2, card3, card4, card5));
        assertEquals(40, hand3.getHighestScore());
    }

    @Test
    void colorShouldReturn40(){
        Hand hand3 = new Hand(List.of(score2, score3, score4, score5, score6));
        assertEquals(40, hand3.getHighestScore());
    }
}
