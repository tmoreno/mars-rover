package com.tmoreno.kata.marsrover;

public class Position{

	private final int x;
	private final int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public Position incrementY() {
		return new Position(x, y + 1);
	}

	public Position decrementY() {
		return new Position(x, y - 1);
	}

	public Position incrementX() {
		return new Position(x + 1, y);
	}

	public Position decrementX() {
		return new Position(x - 1, y);
	}

}
