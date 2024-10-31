import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board;
    private Deque<Player> players = new LinkedList<>();
    private Dice dice;
    private Player winnerPlayer;

    Game() {
        initializeGame();
    }

    void initializeGame() {
        board = new Board(10, 5, 5);
        dice = new Dice(1);
        winnerPlayer = null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("Vishal");
        Player player2 = new Player("Mukesh");

        players.add(player1);
        players.add(player2);
    }

    public void startGame() {
        while (winnerPlayer == null) {
            // find player turn
            Player currPlayer = getPlayerTurn();
            System.out
                    .println("player turn is:" + currPlayer.name + " current position is: " + currPlayer.currPosition);

            // roll the dice
            int diceNum = dice.rollDice();

            // update position
            int newPosition = currPlayer.currPosition + diceNum;
            newPosition = jumpCheck(newPosition);
            currPlayer.currPosition = newPosition;
            System.out.println("player turn is:" + currPlayer.name + " new Position is: " + newPosition);

            // check for winning condition
            if(newPosition >= board.cells.length * board.cells.length-1){

                winnerPlayer = currPlayer;
            }


        }

        System.out.println("WINNER IS:" + winnerPlayer.name);
    }

    private Player getPlayerTurn() {
        Player currPlayer = players.removeFirst();
        players.addLast(currPlayer);
        return currPlayer;
    }

    private int jumpCheck(int playerNewPosition) {
        if (playerNewPosition > (board.cells.length * board.cells.length) - 1) {
            return playerNewPosition;
        }

        Cell cell = board.getCell(playerNewPosition);
        if (cell.jump != null && cell.jump.startPoint == playerNewPosition) {
            String jumpBy = (cell.jump.startPoint < cell.jump.endPoint) ? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);

            playerNewPosition = cell.jump.endPoint;
        }

        return playerNewPosition;
    }
}