
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


import Models.Board;
import Models.PieceType;
import Models.Player;
import Models.PlayingPieceO;
import Models.PlayingPieceX;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    TicTacToeGame() {
        initializeGame();
    }

    private void initializeGame() {
        players = new LinkedList<Player>();
        gameBoard = new Board(3);

        // creating two players
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Vishal", crossPiece);

        PlayingPieceO noughhtsPiece = new PlayingPieceO();
        Player player2 = new Player("Aakash", noughhtsPiece);

        players.add(player1);
        players.add(player2);
    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            Player currPlayer = players.removeFirst();

            gameBoard.printBoard();
            int freeCells = gameBoard.getFreeCells();
            if (freeCells == 0) {
                noWinner = false;
                break;
            }

            // read user input
            System.out.println("Player " + currPlayer.getName() + ": Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            // inputScanner.close();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);
            

            // place the piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputCol, currPlayer.getPlayingPiece());

            if (!pieceAddedSuccessfully) {
                System.out.println("Incorrect position, try again !!");
                players.addFirst(currPlayer);
                continue;
            }
            players.addLast(currPlayer);

            boolean winner = isThereWinner(inputRow, inputCol, currPlayer.playingPiece.pieceType);
            if (winner) {
                return currPlayer.getName();
            }
        }

        return "Game Tied";
    }

    private boolean isThereWinner(int row, int col, PieceType pieceType) {
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // row check
        for (int i = 0; i < gameBoard.getSize(); i++) {
            if (gameBoard.getBoard()[row][i] == null || gameBoard.getBoard()[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        // col check
        for (int i = 0; i < gameBoard.getSize(); i++) {
            if (gameBoard.getBoard()[col][i] == null || gameBoard.getBoard()[col][i].pieceType != pieceType) {
                colMatch = false;
            }
        }

        // diag check
        for (int i = 0, j = 0; i < gameBoard.getSize(); i++, j++) {
            if (gameBoard.getBoard()[i][j] == null || gameBoard.getBoard()[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        // anti diag check
        for (int i = 0, j = gameBoard.getSize()-1; i < gameBoard.getSize(); i++, j--) {
            if (gameBoard.getBoard()[i][j] == null || gameBoard.getBoard()[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        System.out.println(rowMatch);
        System.out.println(colMatch);
        System.out.println(diagonalMatch);
        System.out.println(antiDiagonalMatch);
        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }
}
