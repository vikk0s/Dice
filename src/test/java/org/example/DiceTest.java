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
        assertTrue(dice.getDie2() >= 1 && dice.getDie2() <= 6);
    }

    @org.junit.jupiter.api.Test
    void getDie2() {
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.getDie1() >= 1 && dice.getDie1() <= 6);
    }

    @org.junit.jupiter.api.Test
    void rollUntilDouble() {
        Dice dice = new Dice();
        dice.rollUntilDouble(dice);
        assertTrue(dice.isDouble());
    }
}