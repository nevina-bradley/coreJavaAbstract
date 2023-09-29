package com.codedifferently.lab23.partB.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Test
public class BankTest {
    // Given
    String str = "Chocolate";
    int n = 2;
    String BankName = "BaronBank";
    String AccountHolder = "Elon Musk";
    int AccountNumber = 44559;
    int AccountBalance = 1000;

    // When
    String expected = "BaronBank";

    String actual = Problem.frontCopies(str, n);

    // Then
        Assertions.assertEquals(expected, actual);
}
