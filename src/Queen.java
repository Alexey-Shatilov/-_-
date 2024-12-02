public class Queen extends ChessPiece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (!super.canMoveToPosition(chessBoard, line, column, toLine, toColumn)) {
            return false;
        }

        return (line == toLine || column == toColumn || Math.abs(toLine - line) == Math.abs(toColumn - column));
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
