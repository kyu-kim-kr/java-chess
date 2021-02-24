package net.honux.chess.pieces;


import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

import net.honux.chess.pieces.Piece.Type;

class PieceTest {

    @Test
    public void blank말을포함하여_체스말을_생성하는_모든메서드들_타입이매치하는지확인() {
        verifyPiece(Piece.createWhitePawn(), Piece.createBlackPawn(), Type.PAWN);
        verifyPiece(Piece.createWhiteKnight(), Piece.createBlackKnight(), Type.KNIGHT);
        verifyPiece(Piece.createWhiteRook(), Piece.createBlackRook(), Type.ROOK);
        verifyPiece(Piece.createWhiteBishop(), Piece.createBlackBishop(), Type.BISHOP);
        verifyPiece(Piece.createWhiteQueen(), Piece.createBlackQueen(), Type.QUEEN);
        verifyPiece(Piece.createWhiteKing(), Piece.createBlackKing(), Type.KING);

        Piece blank = Piece.createBlank();
        assertThat(blank.isWhite()).isFalse();
        assertThat(blank.isBlack()).isFalse();
        assertThat(blank.getType()).isEqualTo(Type.NO_PIECE);
    }

    private void verifyPiece(final Piece whitePiece, final Piece blackPiece, final Type type) {
        assertThat(whitePiece.isWhite()).isTrue();
        assertThat(whitePiece.getType()).isEqualTo(type);

        assertThat(blackPiece.isBlack()).isTrue();
        assertThat(blackPiece.getType()).isEqualTo(type);
    }

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
