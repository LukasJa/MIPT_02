package com.example.new_project_02;
import com.example.new_project_02.utils.TextCounter;

import org.junit.Test;
import static org.junit.Assert.*;


public class TextCounterTest {

    @Test
    public void getCharsCount_returnsCorrectCount_forHelloWorld() {
        String givenString = "Hello World!";
        int expectedCharsCount = 12;
        int actualCharsCount = TextCounter.getCharsCount(givenString);
        assertEquals(expectedCharsCount, actualCharsCount);
    }

    @Test
    public void getCharsCount_returnsCorrectCount_forEmptyString() {
        String givenString = "";
        int expectedCharsCount = 0;
        int actualCharsCount = TextCounter.getCharsCount(givenString);
        assertEquals(expectedCharsCount, actualCharsCount);
    }

    @Test
    public void getCharsCount_returnsCorrectCount_forHello() {
        String givenString = "Hello";
        int expectedCharsCount = 5;
        int actualCharsCount = TextCounter.getCharsCount(givenString);
        assertEquals(expectedCharsCount, actualCharsCount);
    }

    @Test
    public void getWordCount_returnsCorrectCount_forHelloWorld() {
        String givenString = "Hello World!";
        int expectedWordCount = 2;
        int actualWordCount = TextCounter.getWordCount(givenString);
        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void getWordCount_returnsCorrectCount_forEmptyString() {
        String givenString = "";
        int expectedWordCount = 0;
        int actualWordCount = TextCounter.getWordCount(givenString);
        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void getWordCount_returnsCorrectCount_forHello() {
        String givenString = "Hello";
        int expectedWordCount = 1;
        int actualWordCount = TextCounter.getWordCount(givenString);
        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void getWordCount_returnsCorrectCount_forHelloWorldAgain() {
        String givenString = "  Hello   World again  ";
        int expectedWordCount = 3;
        int actualWordCount = TextCounter.getWordCount(givenString);
        assertEquals(expectedWordCount, actualWordCount);
    }
}
