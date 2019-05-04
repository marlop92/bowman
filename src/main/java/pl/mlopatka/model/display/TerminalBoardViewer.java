package pl.mlopatka.model.display;

import pl.mlopatka.model.elements.BoardElement;
import pl.mlopatka.model.elements.EmptyBoardElement;
import pl.mlopatka.model.elements.Hero;
import pl.mlopatka.model.elements.Zombie;

public class TerminalBoardViewer implements BoardViewer {

    public void display(BoardElement[][] board) {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char elementRepresentation = transformElement(board[i][j]);
                System.out.print(elementRepresentation + " ");
            }
            System.out.println();
        }
    }

    private char transformElement(BoardElement element) {
        if(element instanceof EmptyBoardElement) {
            return 'E';
        }

        if(element instanceof Hero) {
            return 'H';
        }

        if(element instanceof Zombie) {
            return 'Z';
        }

        return ' ';
    }
}
