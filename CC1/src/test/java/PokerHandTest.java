import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PokerHandTest {
    Card card2;
    Card card3;
    Card card4;
    Card card5;
    Card card6;
    Card card7;
    Card card8;
    Card card9;
    Card card10;
    Card card11;
    Card card12;
    Card card13;
    Card card14;
    Hand hand1;

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

        hand1 = Hand(card2,card3,card4,card5,card6);
    }
    @Test
    void shouldReturn6(){
        assert(hand1.getHighestScore()).equals(10);
    }
}
