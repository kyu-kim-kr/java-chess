package net.honux.chess;

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
}

