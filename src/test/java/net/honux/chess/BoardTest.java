package net.honux.chess;

import static net.honux.chess.utils.StringUtils.appendNewLine;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

import net.honux.chess.pieces.Piece;

class BoardTest {
    private Board board;

    @BeforeEach
    void setup() {
        board = new Board();
    }

    @Test
    void 전체기물의_상태를_볼수있는_체스판구현_테스트() {
        board.initialize();
        assertThat(board.pieceCount()).isEqualTo(32);
        String blankRank = appendNewLine("........");
        assertThat(board.showBoard())
                .isEqualTo(
                        appendNewLine("RNBQKBNR") +
                        appendNewLine("PPPPPPPP") +
                        blankRank + blankRank + blankRank + blankRank +
                        appendNewLine("pppppppp") +
                        appendNewLine("rnbqkbnr")
                );
    }

    @Test
    void findPiece() {
        board.initialize();

        assertThat(board.findPiece("a8")).isEqualTo(Piece.createBlackRook());
    }
}
