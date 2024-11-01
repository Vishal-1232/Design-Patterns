package Models;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if(row < size && col < size && row >= 0 && col >= 0 ){
            
            if (board[row][col] != null) {
                return false;
            }
    
            board[row][col] = playingPiece;
            return true;
        }

        return false;
    }

    public int getFreeCells() {
        int count = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    count++;
                }
            }
        }

        return count;
    }

    public void printBoard(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j]!=null){
                    System.out.print(board[i][j].pieceType+" | ");
                }else{
                    System.out.print( i + "," + j +" | ");
                }
            }
            System.out.println("");
        }
    }

    public int getSize() {
        return size;
    }

    public PlayingPiece[][] getBoard() {
        return board;
    }
}
