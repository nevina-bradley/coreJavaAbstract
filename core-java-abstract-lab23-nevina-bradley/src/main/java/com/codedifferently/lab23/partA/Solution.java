package com.codedifferently.lab23.partA;

public class Solution {
    /*
    We are looking to write down a list of all possible numbers that can be a
    multiple of 3 or 5.
    You will be given any number, but to be put on the list the number has to be a non-negative number.
    Return true if the given number can be added to the list.
    Tip: Think about using the % "mod" operator
    multipleOf(3) --> true
    multipleOf(10) --> true
    multipleOf(8) --> false
     */

    public static Boolean multipleOf(int number){
        return number >= 0 && (number % 3 == 0 || number % 5 == 0);
    }
}
