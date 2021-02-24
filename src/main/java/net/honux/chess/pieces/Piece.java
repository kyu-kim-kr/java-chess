package net.honux.chess.pieces;

public class Piece {
    public enum Color {
        WHITE, BLACK, NOCOLOR;
    }

    public enum Type {
        PAWN('p'), KNIGHT('n'), ROOK('r'),
        BISHOP('b'), QUEEN('q'), KING('k');

        public char representation;

        Type(char representation) {
            this.representation = representation;
        }
    }

    private Color color;
    private char representation;

    private Piece(String color, char representation) {
        this.color = color;
        this.representation = representation;
    }

    public Color getColor() {
        return color;
    }

    public char getRepresentation() {
        return representation;
    }

    public static Piece createWhitePawn() {
        return new Piece(Color.WHITE, Type.PAWN.representation);
    }

    public static Piece createBlackPawn() {
        return new Piece(Color.BLACK, Type.PAWN.representation);
    }

    public static Piece createWhiteKnight() {
        return new Piece(Color.WHITE, Type.KNIGHT.representation);
    }

    public static Piece createBlackKnight() {
        return new Piece(Color.BLACK, Type.KNIGHT.representation);
    }

    public static Piece createWhiteRook() {
        return new Piece(Color.WHITE, Type.ROOK.representation);
    }

    public static Piece createBlackRook() {
        return new Piece(Color.BLACK, Type.ROOK.representation);
    }

    public static Piece createWhiteBishop() {
        return new Piece(Color.WHITE, Type.BISHOP.representation);
    }

    public static Piece createBlackBishop() {
        return new Piece(Color.BLACK, Type.BISHOP.representation);
    }

    public static Piece createWhiteQueen() {
        return new Piece(Color.WHITE, Type.QUEEN.representation);
    }

    public static Piece createBlackQueen() {
        return new Piece(Color.BLACK, Type.QUEEN.representation);
    }

    public static Piece createWhiteKing() {
        return new Piece(Color.WHITE, Type.KING.representation);
    }

    public static Piece createBlackKing() {
        return new Piece(Color.BLACK, Type.KING.representation);
    }

    public boolean isWhite() {
        return this.color.equals(WHITE_COLOR);
    }

    public boolean isBlack() {
        return this.color.equals(BLACK_COLOR);
    }
}
