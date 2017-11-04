package com.tmoreno.kata.marsrover;

public enum Direction {
	NORTH {
		@Override
		public Direction rotateLeft() {
			return WEST;
		}

		@Override
		public Direction rotateRight() {
			return EAST;
		}

		@Override
		public Position forward(Position position) {
			return position.incrementY();
		}

		@Override
		public Position backward(Position position) {
			return position.decrementY();
		}
	}, SOUTH {
		@Override
		public Direction rotateLeft() {
			return EAST;
		}

		@Override
		public Direction rotateRight() {
			return WEST;
		}

		@Override
		public Position forward(Position position) {
			return position.decrementY();
		}

		@Override
		public Position backward(Position position) {
			return position.incrementY();
		}
	}, EAST {
		@Override
		public Direction rotateLeft() {
			return NORTH;
		}

		@Override
		public Direction rotateRight() {
			return SOUTH;
		}

		@Override
		public Position forward(Position position) {
			return position.incrementX();
		}

		@Override
		public Position backward(Position position) {
			return position.decrementX();
		}
	}, WEST {
		@Override
		public Direction rotateLeft() {
			return SOUTH;
		}

		@Override
		public Direction rotateRight() {
			return NORTH;
		}

		@Override
		public Position forward(Position position) {
			return position.decrementX();
		}

		@Override
		public Position backward(Position position) {
			return position.incrementX();
		}
	};
	

	public abstract Direction rotateLeft();

	public abstract Direction rotateRight();
	
	public abstract Position forward(final Position position);
	
	public abstract Position backward(final Position position);
	
}
