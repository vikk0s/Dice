package org.example;

public class Dice {
    private int die1;
    private int die2;

    public void roll() {
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
    }

    public boolean isDouble() {
        return die1 == die2;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public static void rollUntilDouble(Dice dice) {
        int times = 0;
        boolean isDouble = false;

        while (!isDouble) {
            dice.roll();
            times++;
            System.out.println("Rolling the dice");
            System.out.println("Die 1: " + dice.getDie1());
            System.out.println("Die 2: " + dice.getDie2());
            if (dice.isDouble()) {
                System.out.println("It's a double!");
                System.out.println("It took " + times + " rolls to get a double");
                isDouble = true;
            }
        }
    }

    public static void main(String[] args) {
        Dice dice = new Dice();

        rollUntilDouble(dice);
    }
}
