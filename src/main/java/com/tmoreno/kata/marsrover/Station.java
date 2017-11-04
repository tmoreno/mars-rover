package com.tmoreno.kata.marsrover;

public class Station {

	private Rover rover;
	private Terrain terrain;

	public void setRover(Rover rover) {
		this.rover = rover;
	}

	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}

	public void move(Command[] commands) {
		for(Command command : commands) {	
			if (command == Command.FORWARD) {
				Position currentPosition = rover.getPosition();
				
				Position nextPosition = rover.getDirection().forward(currentPosition);
				
				rover.setPosition(nextPosition);
			}
			else if (command == Command.BACKWARD) {
				Position currentPosition = rover.getPosition();
				
				Position nextPosition = rover.getDirection().backward(currentPosition);
				
				rover.setPosition(nextPosition);
			}
			else if (command == Command.LEFT) {
				Direction currentDirection = rover.getDirection();
				
				rover.setDirection(currentDirection.rotateLeft());
			}
			else if (command == Command.RIGHT) {
				Direction currentDirection = rover.getDirection();
				
				rover.setDirection(currentDirection.rotateRight());
			}
		}
	}

}
