package boardgame;

public class position {

	private int row;
	private int column;

	public position() {
	}

	public position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public void setValue(int row, int column) {

	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	
	public String toString() {
		return row + ", " + column;
	}
}
