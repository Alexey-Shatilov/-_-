public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (!super.canMoveToPosition(chessBoard, line, column, toLine, toColumn)) {
            return false;
        }

        if (getColor().equals("White")) {
            if (line == 1) {
                return (toLine == line + 1 || toLine == line + 2) && toColumn == column;
            } else {
                return toLine == line + 1 && toColumn == column;
            }
        } else {
            if (line == 6) {
                return (toLine == line - 1 || toLine == line - 2) && toColumn == column;
            } else {
                return toLine == line - 1 && toColumn == column;
            }
        }
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}