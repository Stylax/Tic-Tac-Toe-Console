package com.aleks;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Board.print();
    }
}

class Board {
    static char[][] boardState = {{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'X', 'X', 'O'}};
    public static void print (){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(boardState[i][j] + " ");
            }
            System.out.println();
        }
    }
}
