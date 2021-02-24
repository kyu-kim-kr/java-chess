package net.honux.chess;

import static net.honux.chess.utils.StringUtils.appendNewLine;
import static net.honux.chess.pieces.Piece.*;

import net.honux.chess.pieces.Piece;

import java.util.ArrayList;

public class Board {

    private static final int BOARD_LENGTH = 8;

    private ArrayList<Piece> whitePawns = new ArrayList<>();
    private ArrayList<Piece> whitePieces = new ArrayList<>();
    private ArrayList<Piece> blackPawns = new ArrayList<>();
    private ArrayList<Piece> blackPieces = new ArrayList<>();

    public void add(Piece pawn) {
        distinguishPawnsColor(pawn).add(pawn);
    }

    public int size(Piece pawn) {
        return distinguishPawnsColor(pawn).size();
    }

    public Piece findPawn(Piece pawn, int index) {
        return distinguishPawnsColor(pawn).get(index);
    }

    private ArrayList<Piece> distinguishPawnsColor(Piece pawn) {
        if (pawn.getColor() == Piece.WHITE_COLOR)
            return whitePawns;
        else
            return blackPawns;
    }

    public void initialize() {
        for (int i = 0; i < BOARD_LENGTH; i++) {
            whitePawns.add(createWhitePawn());
            blackPawns.add(createBlackPawn());
        }
        whitePieces.add(createWhiteRook());
        whitePieces.add(createWhiteKnight());
        whitePieces.add(createWhiteBishop());
        whitePieces.add(createWhiteQueen());
        whitePieces.add(createWhiteKing());
        whitePieces.add(createWhiteBishop());
        whitePieces.add(createWhiteKnight());
        whitePieces.add(createWhiteRook());

        blackPieces.add(createBlackRook());
        blackPieces.add(createBlackKnight());
        blackPieces.add(createBlackBishop());
        blackPieces.add(createBlackQueen());
        blackPieces.add(createBlackKing());
        blackPieces.add(createBlackBishop());
        blackPieces.add(createBlackKnight());
        blackPieces.add(createBlackRook());
    }

    private String getWhitePiecesResult() {
        return listPiecesToSingleLine(whitePieces);
    }

    private String getWhitePawnsResult() {
        return listPiecesToSingleLine(whitePawns);
    }

    private String getBlackPiecesResult() {
        return listPiecesToSingleLine(blackPieces);
    }

    private String getBlackPawnsResult() {
        return listPiecesToSingleLine(blackPawns);
    }

    private String getBlankLine() {
        return "........";
    }

    private String listPiecesToSingleLine(ArrayList<Piece> pieces) {
        StringBuilder sb = new StringBuilder();

        for (Piece p : pieces)
            sb.append(p.getRepresentation());

        return sb.toString();
    }

    public String showBoard() {
        StringBuilder sb = new StringBuilder();
        sb.append(appendNewLine(getBlackPiecesResult()));
        sb.append(appendNewLine(getBlackPawnsResult()));
        sb.append(appendNewLine(getBlankLine()));
        sb.append(appendNewLine(getBlankLine()));
        sb.append(appendNewLine(getBlankLine()));
        sb.append(appendNewLine(getBlankLine()));
        sb.append(appendNewLine(getWhitePawnsResult()));
        sb.append(appendNewLine(getWhitePiecesResult()));
        return sb.toString();
    }

    public int pieceCount() {
        return whitePieces.size() + whitePawns.size() + blackPieces.size() + whitePawns.size();
    }
}

