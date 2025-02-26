package org.example;

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @org.junit.jupiter.api.Test
    void roll() {
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.getDie1() >= 1 && dice.getDie1() <= 6);
        assertTrue(dice.getDie2() >= 1 && dice.getDie2() <= 6);
    }

    @org.junit.jupiter.api.Test
    void isDouble() {
        Dice dice = new Dice();
        int die1 = dice.getDie1();
        int die2 = dice.getDie2();
        while (die1 != die2) {
            dice.roll();
            die1 = dice.getDie1();
            die2 = dice.getDie2();
        }
        assertTrue(dice.isDouble());
    }

    @org.junit.jupiter.api.Test
    void getDie1() {
        Dice dice = new Dice();
        dice.roll();
        int die1 = dice.getDie1();
        if (die1 == 1) {
            assertEquals(1, die1);
        } else if (die1 == 2) {
            assertEquals(2, die1);
        } else if (die1 == 3) {
            assertEquals(3, die1);
        } else if (die1 == 4) {
            assertEquals(4, die1);
        } else if (die1 == 5) {
            assertEquals(5, die1);
        } else if (die1 == 6) {
            assertEquals(6, die1);
        }
    }

    @org.junit.jupiter.api.Test
    void getDie2() {
        Dice dice = new Dice();
        dice.roll();
        int die2 = dice.getDie2();
        if (die2 == 1) {
            assertEquals(1, die2);
        } else if (die2 == 2) {
            assertEquals(2, die2);
        } else if (die2 == 3) {
            assertEquals(3, die2);
        } else if (die2 == 4) {
            assertEquals(4, die2);
        } else if (die2 == 5) {
            assertEquals(5, die2);
        } else if (die2 == 6) {
            assertEquals(6, die2);
        }
    }
}