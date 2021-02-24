package net.honux.chess.pieces;


import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

class PieceTest {

    @Test
    void 컬러에따라서_representaion이_대소문자_변경잘됐는지_확인 () {
        assertThat(Piece.createBlackBishop().getRepresentation()).isEqualTo('B');
    }

    @Test
    void 검색은색_흰색_말들을_구분하는_테스트() {
        assertThat(Piece.createWhiteQueen().isWhite()).isTrue();
        assertThat(Piece.createBlackBishop().isBlack()).isTrue();
    }
}
