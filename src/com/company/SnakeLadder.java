package com.company;

public class SnakeLadder {
    public static void main(String[] args) {
        int c = 0;
        int d = 0;
        int k = 0;
        while (d <= 99 && c <= 99) {
            int Player1 = (int) Math.floor(Math.random() * 10) % 6;
            int Player2 = (int) Math.floor(Math.random() * 10) % 6;
            k = k + 1;
            int b = (int) Math.floor(Math.random() * 10) % 3;
            switch (b) {
                case 1:
                    c = c - Player1;
                    d = d - Player2;
                    if (c < 0) {
                        c = 0;
                    }
                    if (d < 0) {
                        d = 0;
                    }

                    break;
                case 2:
                    c = c + Player1;
                    d = d + Player2;
                    if (c > 100) {
                        c = c - Player1;
                    }
                    if (d > 100) {
                        d = d - Player2;
                    }
                    break;
                default:
                    c = c + 0;
                    d = d + 0;
            }
        }
        if (c == 100) {
            System.out.println("Player1 won the game by " + k + " time throwing the dice");
        } else {
            System.out.println("Player2 won the game by " + k + " time throwing the dice");

        }

    }
}