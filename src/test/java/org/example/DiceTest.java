package org.example;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
    void isNotDouble() {
        Dice dice = new Dice();
        int die1 = dice.getDie1();
        int die2 = dice.getDie2();
        while (die1 == die2) {
            dice.roll();
            die1 = dice.getDie1();
            die2 = dice.getDie2();
        }
        assertFalse(dice.isDouble());
    }

    @org.junit.jupiter.api.Test
    void getDie1() {
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.getDie1() >= 1 && dice.getDie1() <= 6);
    }

    @org.junit.jupiter.api.Test
    void getDie2() {
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.getDie2() >= 1 && dice.getDie2() <= 6);
    }

    @org.junit.jupiter.api.Test
    void rollUntilDouble() {
        Dice dice = new Dice();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        dice.rollUntilDouble(dice);

        System.setOut(System.out);

        assertTrue(outContent.toString().contains("Rolling the dice"));
        assertTrue(outContent.toString().contains("It's a double!"));
        assertTrue(dice.isDouble());
    }

    @org.junit.jupiter.api.Test
    void testInitialState() {
        Dice dice = new Dice();
        assertEquals(0, dice.getDie1());
        assertEquals(0, dice.getDie2());
    }
}