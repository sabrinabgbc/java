package objectOriented.chess;

import objectOriented.chess.exception.ChessException;
import objectOriented.chess.piece.attribute.Position;

public class ChessPosition {
    private char column;
    private int row;

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public ChessPosition(char column, int row) {
        if(column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error: The valid values are from a1 to h8");
        }
        this.column = column;
        this.row = row;
    }

    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
    }

    public String print() {
        return "column: " + column + " row: " + row;
    }
}