package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // the bracketGimme designation is testing the "positive" tests given in the
    // Studio instructions on the BalancedBrackets class page

    @Test
    public void bracketGimme1() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketGimme2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketGimme3() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void bracketGimme4() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    // below are the "false" tests given in the Studio instructions

    @Test
    public void bracketGimme5() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void bracketGimme6() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void bracketGimme7() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void bracketGimme8() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    // from this point forward are "original" tests to bring the count to 12 total

    @Test
    public void rightBracketTest() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("I forgot something]"));
    }

    @Test
    public void netPositiveTest() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[I regret eating Taco Bell...]"));
    }

    @Test
    public void netNegativeTest() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Those Burritos Del Grande aren't sitting well]]"));
    }

    @Test
    public void curlyBracketPositive() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Oh dear Lord, {My butt is on fire}]"));
    }

    @Test
    public void curlyBracketNegative() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Don't use the {upstairs bathroom}!!!"));
    }

}
