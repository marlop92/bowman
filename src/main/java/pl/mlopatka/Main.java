package pl.mlopatka;

import pl.mlopatka.model.BoardManager;
import pl.mlopatka.model.display.BoardViewer;
import pl.mlopatka.model.display.TerminalBoardViewer;
import pl.mlopatka.model.elements.Hero;
import pl.mlopatka.model.elements.Zombie;

public class Main {

    public static void main(String[] args) {
        BoardViewer viewer = new TerminalBoardViewer();
        BoardManager bm = new BoardManager(viewer);
        bm.initBoard(3, 4);
        bm.insertElement(0,0, new Hero());
        bm.insertElement(2,0, new Zombie());
        bm.insertElement(3,1, new Zombie());
        bm.insertElement(3,2, new Zombie());
        bm.displayBoard();
        bm.moveElement(2,0, 1, 0);
        bm.displayBoard();
        bm.moveElement(3,2, 2, 2);
        bm.displayBoard();
    }
}
