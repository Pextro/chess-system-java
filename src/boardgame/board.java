package boardgame;

public class board {
	
	private int rows;
	private int columns;
	private Piece [][] pieces;
	
	public board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece [rows][columns];
	}
	
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}


	public Piece piece(int row, int columns) {
		return null;
	}
	public Piece piece(position position) {
		return null;
	}
	public void placePiece(Piece piece, position position) {
		
	}
	public Piece removePiece(position position) {
		return null;
	}
	public boolean positionExists(position position) {
		return false;
	}
	public boolean therelsAPiece(position position) {
		return false;
	}
}
