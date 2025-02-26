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
        dice.roll();
        int die1 = dice.getDie1();
        int die2 = dice.getDie2();
        if (die1 == die2) {
            assertEquals(true, dice.isDouble());
        } else {
            assertEquals(false, dice.isDouble());
        }
    }
}