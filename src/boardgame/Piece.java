package boardgame;

public abstract class Piece {
	
	protected position position;
	private board board;
	
	public Piece(boardgame.board board) {
		this.board = board;
	}

	public position getPosition() {
		return position;
	}
	
	protected board getBoard() {
		return board;
	}
	
	public abstract Piece[][] possibleMoves();
	
	public boolean possibleMove(position position) {
		return false;
	}
	public boolean isThereAnyPossibleMove() {
		return false;
	}
}
