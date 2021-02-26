package net.honux.chess;

import net.honux.chess.pieces.Piece;

import static net.honux.chess.pieces.Piece.*;

import java.util.ArrayList;

public class Rank {

    private ArrayList<Piece> pieces = new ArrayList<>();

    private void addPiece(Piece piece) {
        pieces.add(piece);
    }

    public static Rank initWhitePieces() {
        Rank rank = new Rank();
        rank.addPiece(createWhiteRook());
        rank.addPiece(createWhiteKnight());
        rank.addPiece(createWhiteBishop());
        rank.addPiece(createWhiteQueen());
        rank.addPiece(createWhiteKing());
        rank.addPiece(createWhiteBishop());
        rank.addPiece(createWhiteKnight());
        rank.addPiece(createWhiteRook());
        return rank;
    }

    public static Rank initBlackPieces() {
        Rank rank = new Rank();
        rank.addPiece(createBlackRook());
        rank.addPiece(createBlackKnight());
        rank.addPiece(createBlackBishop());
        rank.addPiece(createBlackQueen());
        rank.addPiece(createBlackKing());
        rank.addPiece(createBlackBishop());
        rank.addPiece(createBlackKnight());
        rank.addPiece(createBlackRook());
        return rank;
    }

    public static Rank initWhitePawns() {
        Rank rank = new Rank();
        for (int i = 0; i < Board.BOARD_LENGTH; i++) {
            rank.addPiece(createWhitePawn());
        }
        return rank;
    }

    public static Rank initBlackPawns() {
        Rank rank = new Rank();
        for (int i = 0; i < Board.BOARD_LENGTH; i++) {
            rank.addPiece(createBlackPawn());
        }
        return rank;
    }

    public static Rank initBlankLine() {
        Rank rank = new Rank();
        for (int i = 0; i < Board.BOARD_LENGTH; i++) {
            rank.addPiece(createBlank());
        }
        return rank;
    }

    public int getSize() {
        return pieces.size();
    }

    public String getRepresentations() {
        StringBuilder sb = new StringBuilder();

        for (Piece p : pieces)
            sb.append(p.getRepresentation());

        return sb.toString();
    }

    public Piece findParticularPiece(int index) {
        return pieces.get(index);
    }

}
