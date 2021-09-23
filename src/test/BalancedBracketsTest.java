package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }


    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void OnlyOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void endBracketInsideStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]"));
    }

    @Test
    public void BalancedBracketsWithStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void EmptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void InbetweenBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void BracketsBackToBackReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void BalancedBracketInsideWordReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void BalancedBracketOutsideWordReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void TwoPairsOfBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void MultipleBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }

    @Test
    public void AllOpenBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[[[[[["));
    }
}
