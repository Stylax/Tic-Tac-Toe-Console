package com.aleks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printCurrentBoard();
    }

    static char[][] boardState = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

    public static void printCurrentBoard () {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j < 2) {
                    System.out.print(boardState[i][j] + "|");
                } else System.out.print(boardState[i][j]);
            }
            System.out.println();
            if (i < 2) {
                System.out.println("-+-+-");
            }
        }
    }

    public static void userInput() {

    }

}




