package com.tmoreno.kata.marsrover;

public class Rover {
	
	private Position position;
	private Direction direction;

	public void setPosition(Position position) {
		this.position = position;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Position getPosition() {
		return position;
	}

	public Direction getDirection() {
		return direction;
	}

}
