import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    Board(int boardSize, int numberOfSnakes, int numberOfLadders) {
        initializeCells(boardSize);
        addSnakesLadders(cells, numberOfSnakes, numberOfLadders);

    }

    private void initializeCells(int boardSize) {

        cells = new Cell[boardSize][boardSize];

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
    }

    private void addSnakesLadders(Cell[][] cells, int numberOfSnakes, int numberOfLadders) {

        // adding snakes in board
        while (numberOfSnakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);

            if(snakeTail >= snakeHead){
                continue;
            }

            Jump snakeJump = new Jump(snakeHead, snakeTail);

            Cell cell = getCell(snakeHead);
            cell.jump = snakeJump;

            numberOfSnakes--;
        }
        // adding ladders in board
        while (numberOfLadders > 0) {
            int ladderHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);

            if(ladderHead >= ladderTail){
                continue;
            }

            Jump ladderJump = new Jump(ladderHead, ladderTail);
            Cell cell = getCell(ladderHead);
            cell.jump = ladderJump;

            numberOfLadders--;
        }
    }

    Cell getCell(int playerPosition) {
        int boardRow = playerPosition / cells.length;
        int boardColumn = (playerPosition % cells.length);
        return cells[boardRow][boardColumn];
    }


}
