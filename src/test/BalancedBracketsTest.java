package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        String spec ="A single set of balanced brackets return true";
        String testData = "[]";
        boolean result  = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void onlyBracketsReturnsFalse() {
        String spec = "Brackets in wrong order return false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void nonBracketReturnTrue(){
        String spec = "non bracket elements return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("test"));
    }

    @Test
    public void emptyStringReturnTrue(){
        String spec = "Empty String returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void bracketsAtAnyPosition(){
        String spec = "Pair of opening and Closing brackets at any position return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void nestedBrackets(){
        String spec = "Many nested brackets pair return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]]]]"));
    }

    @Test
    public void manyBracketsWithOtherCharacters(){
        String spec = "Many brackets that are in pair and with non bracket characters return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[la[un[[ch]c]o]d]e"));
    }

    @Test
    public void manyBracketsNotPaired(){
        String spec = "Many brackets that are not in pair return false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void consecutivePairOfBracketReturnTrue(){
        String spec = "Alternating pair of brackets return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][]"));
    }

    @Test
    public void singleOpeningBracket(){
        String spec = "Single opening bracket return false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleClosingBracket(){
        String spec = "Single closing bracket return false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

}

