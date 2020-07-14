package com.aleks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Board.printBoard(UserInput.inputIntoBoard());
    }
}

class Board {
    public static void printBoard (char[][] boardState){
        System.out.println("---------");
        for (int i = 0; i < 3; i++){
            System.out.print("| ");
            for (int j = 0; j < 3; j++){
                System.out.print(boardState[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
    }
}

class UserInput {

    static Scanner scanner = new Scanner(System.in);
    static String input = scanner.nextLine();

    static char[][] boardState = new char [3][3];

    public static char[][] inputIntoBoard() {
        int help = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardState[i][j] = input.charAt(help);
                help++;
            }
        }
        return boardState;
    }
}