package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusBinarySearchTest {

    int [] positiveArray = {2,5,7,18,29,44,86};
    int [] negativeArray = {-47,-24,-1,0,14,63,99};
    int [] singleNumArray = {50};
    int [] emptyArray = new int[0];

    @Test
    public void firstHalf(){
        String spec = "a number in the first half of the array is found";
        int testNum = 7;
        int expectedResult = 2;
        int actualResult = BonusBinarySearch.binarySearch(positiveArray, testNum);
        assertEquals(spec, expectedResult, actualResult);
    }

    @Test
    public void secondHalf(){
        String spec = "a number in the second half of the array is found";
        int testNum = 29;
        int expectedResult = 4;
        int actualResult = BonusBinarySearch.binarySearch(positiveArray, testNum);
        assertEquals(spec, expectedResult, actualResult);
    }

    @Test
    public void exactMiddle(){
        String spec = "a number in the middle of the array is found";
        int testNum = 18;
        int expectedResult = 3;
        int actualResult = BonusBinarySearch.binarySearch(positiveArray, testNum);
        assertEquals(spec, expectedResult, actualResult);
    }

    @Test
    public void firstIndex(){
        String spec = "a number in the first index of the array is found";
        int testNum = 2;
        int expectedResult = 0;
        int actualResult = BonusBinarySearch.binarySearch(positiveArray, testNum);
        assertEquals(spec, expectedResult, actualResult);
    }

    @Test
    public void lastIndex(){
        String spec = "a number at the last index of the array is found";
        int testNum = 86;
        int expectedResult = 6;
        int actualResult = BonusBinarySearch.binarySearch(positiveArray, testNum);
        assertEquals(spec, expectedResult, actualResult);
    }
    @Test
    public void negativeNumbers(){
        String spec = "a negative number in the array is found";
        int testNum = -24;
        int expectedResult = 1;
        int actualResult = BonusBinarySearch.binarySearch(negativeArray, testNum);
        assertEquals(spec, expectedResult, actualResult);
    }

    @Test
    public void notFound(){
        String spec = "a number that is not there in the array is not found ";
        int testNum = 100;
        int expectedResult = -1;
        int actualResult = BonusBinarySearch.binarySearch(positiveArray, testNum);
        assertEquals(spec, expectedResult, actualResult);
    }

    @Test
    public void singleNumArray(){
        String spec = "a number is found in the array of length 1 ";
        int testNum = 50;
        int expectedResult = 0;
        int actualResult = BonusBinarySearch.binarySearch(singleNumArray, testNum);
        assertEquals(spec, expectedResult, actualResult);
    }

    @Test
    public void singleNumArrayNotFound(){
        String spec = "a number not in the array is not found in the array of length 1 ";
        int testNum = 80;
        int expectedResult = -1;
        int actualResult = BonusBinarySearch.binarySearch(singleNumArray, testNum);
        assertEquals(spec, expectedResult, actualResult);
    }

    @Test
    public void emptyArray(){
        String spec = "a number is not found in an empty array";
        int testNum = 80;
        int expectedResult = -1;
        int actualResult = BonusBinarySearch.binarySearch(emptyArray, testNum);
        assertEquals(spec, expectedResult, actualResult);
    }


}
