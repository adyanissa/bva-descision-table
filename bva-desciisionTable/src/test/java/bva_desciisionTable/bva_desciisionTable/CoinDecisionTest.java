package bva_desciisionTable.bva_desciisionTable;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoinDecisionTest {

    CoinDecision cd = new CoinDecision();

    @Test
    void testR1_twoHeads_shouldReturnPositive() {
        assertEquals("Negative", cd.CoinDecision("T", "T", "T", "T"));
    }

    @Test
    void testR2_twoHeadsDifferentPositions_shouldReturnPositive() {
        assertEquals("Negative", cd.CoinDecision("T", "T", "H", "T"));
    }

    @Test
   void testR3_threeHeads_shouldReturnPositive() {
        assertEquals("Positive", cd.CoinDecision("H", "T", "T", "H"));
    }

    @Test
    void testR4_zeroHeads_shouldReturnNegative() {
        assertEquals("Positive", cd.CoinDecision("H", "T", "H", "H"));
    }

    @Test
    void testR5_oneHead_shouldReturnNegative() {
        assertEquals("Positive", cd.CoinDecision("H", "H", "H", "H"));
    }
}

