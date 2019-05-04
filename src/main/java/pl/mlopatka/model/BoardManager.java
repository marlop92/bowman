package pl.mlopatka.model;

import pl.mlopatka.model.display.BoardViewer;
import pl.mlopatka.model.elements.BoardElement;
import pl.mlopatka.model.elements.EmptyBoardElement;

public class BoardManager {

    private BoardElement[][] board;
    private BoardViewer viewer;

    public BoardManager(BoardViewer viewer) {
        this.viewer = viewer;
    }

    public void initBoard(int height, int length) {
        board = new BoardElement[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                board[i][j] = new EmptyBoardElement();
            }
        }
    }

    public void insertElement(int x, int y, BoardElement element) {
        board[y][x] = element;
    }

    public void moveElement(int x, int y, int destX, int destY) {
        BoardElement tmp = board[y][x];
        clearElement(x, y);
        insertElement(destX, destY, tmp);
    }

    public void clearElement(int x, int y) {
        board[y][x] = new EmptyBoardElement();
    }

    public void displayBoard() {
        viewer.display(board);
    }

}
