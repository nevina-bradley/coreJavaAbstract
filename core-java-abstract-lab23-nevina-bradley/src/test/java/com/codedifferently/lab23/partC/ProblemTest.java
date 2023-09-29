package com.codedifferently.lab23.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    // Problem 07
    @Test
    public void frontCopiesTest01() {

        // Given
        String str = "Chocolate";
        int n = 2;

        // When
        String expected = "ChoCho";
        String actual = Problem.frontCopies(str, n);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void frontCopiesTest02() {

        // Given
        String str = "Chocolate";
        int n = 3;

        // When
        String expected = "ChoChoCho";
        String actual = Problem.frontCopies(str, n);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void frontCopiesTest03() {

        // Given
        String str = "Abc";
        int n = 3;

        // When
        String expected = "AbcAbcAbc";
        String actual = Problem.frontCopies(str, n);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 08
    @Test
    public void everyOtherBitTest01() {

        // Given
        String str = "Hello";

        // When
        String expected = "Hlo";
        String actual = Problem.everyOtherBit(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void everyOtherBitTest02() {

        // Given
        String str = "Hi";

        // When
        String expected = "H";
        String actual = Problem.everyOtherBit(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void everyOtherBitTest03() {

        // Given
        String str = "Heeololeo";

        // When
        String expected = "Hello";
        String actual = Problem.everyOtherBit(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    // Problem 09
    @Test
    public void favoriteNineTest01() {

        // Given
        int[] nums = {1, 2, 9};

        // When
        Integer expected = 1;
        Integer actual = Problem.favoriteNine(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void favoriteNineTest02() {

        // Given
        int[] nums = {1, 9, 9};

        // When
        Integer expected = 2;
        Integer actual = Problem.favoriteNine(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void favoriteNineTest03() {

        // Given
        int[] nums = {1, 9, 9, 3, 9};

        // When
        Integer expected = 3;
        Integer actual = Problem.favoriteNine(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 10
    @Test
    public void amIAMatchTest01() {

        // Given
        String a = "xxcaazz";
        String b = "xxbaaz";

        // When
        Integer expected = 3;
        Integer actual = Problem.amIAMatch(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amIAMatchTest02() {

        // Given
        String a = "abc";
        String b = "abc";

        // When
        Integer expected = 2;
        Integer actual = Problem.amIAMatch(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amIAMatchTest03() {

        // Given
        String a = "abc";
        String b = "axc";

        // When
        Integer expected = 0;
        Integer actual = Problem.amIAMatch(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 11
    @Test
    public void unluckyYakTest01() {

        // Given
        String str = "yakpak";

        // When
        String expected = "pak";
        String actual = Problem.unluckyYak(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void unluckyYakTest02() {

        // Given
        String str = "pakyak";

        // When
        String expected = "pak";
        String actual = Problem.unluckyYak(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void unluckyYakTest03() {

        // Given
        String str = "yak123ya";

        // When
        String expected = "123ya";
        String actual = Problem.unluckyYak(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 12
    @Test
    public void pattern271Test01() {

        // Given
        int[] nums = {1, 2, 7, 1};

        // When
        Boolean expected = true;
        Boolean actual = Problem.pattern271(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pattern271Test02() {

        // Given
        int[] nums = {1, 2, 8, 1};

        // When
        Boolean expected = false;
        Boolean actual = Problem.pattern271(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pattern271Test03() {

        // Given
        int[] nums = {2, 7, 1};

        // When
        Boolean expected = true;
        Boolean actual = Problem.pattern271(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
