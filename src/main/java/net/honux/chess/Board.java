package net.honux.chess;

import net.honux.chess.pieces.Piece;

import static net.honux.chess.utils.StringUtils.appendNewLine;
import static net.honux.chess.Rank.*;

import java.util.ArrayList;

public class Board {
    public static final int BOARD_LENGTH = 8;

    private ArrayList<Rank> ranks = new ArrayList<>();

    public void initialize() {
        ranks.add(initBlackPieces());
        ranks.add(initBlackPawns());
        ranks.add(initBlankLine());
        ranks.add(initBlankLine());
        ranks.add(initBlankLine());
        ranks.add(initBlankLine());
        ranks.add(initWhitePawns());
        ranks.add(initWhitePieces());
    }

    public String showBoard() {
        StringBuilder sb = new StringBuilder();

        for (Rank r : ranks)
            sb.append(appendNewLine(r.getRepresentations()));

        return sb.toString();
    }

    public int pieceCount() {
        return ranks.get(0).getSize() + ranks.get(1).getSize() + ranks.get(6).getSize() + ranks.get(7).getSize();
    }

    public Piece findPiece(String coordinate) {
        int[] indexVersionCoordinate = getIndexVersionCoordinate(coordinate);
        return ranks
                .get(indexVersionCoordinate[1])
                .findParticularPiece(indexVersionCoordinate[0]);
    }

    private int[] getIndexVersionCoordinate(String coordinate) {
        String[] a = coordinate.split("");
        int rank = Integer.valueOf(a[1]);
        int rankIndex = rank - 8;
        if (rankIndex < 0) {
            rankIndex = -rankIndex;
        }

        char col = a[0].charAt(0);
        int colToInteger = 0;

        switch (col) {
            case 'a':
                colToInteger = 0;
                break;
            case 'b':
                colToInteger = 1;
                break;
            case 'c':
                colToInteger = 2;
                break;
            case 'd':
                colToInteger = 3;
                break;
            case 'e':
                colToInteger = 4;
                break;
            case 'f':
                colToInteger = 5;
                break;
            case 'g':
                colToInteger = 6;
                break;
            case 'h':
                colToInteger = 7;
                break;
        }

        return new int[]{colToInteger, rankIndex};
    }
}

