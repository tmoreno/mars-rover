package com.tmoreno.kata.marsrover;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MarsRoverKataTest {
	
	private Terrain terrain;
	private Rover rover;
	private Station station;

	@Before
	public void setUp() {
		terrain = new Terrain(10, 10);
		
		rover = new Rover();
		rover.setPosition(new Position(5, 5));
		rover.setDirection(Direction.NORTH);
		
		station = new Station();
		station.setRover(rover);
		station.setTerrain(terrain);
	}
    
	@Test
	public void being_at_center_after_move_one_step_forward_rover_should_be_at_5_6() {
		Command[] commands = new Command[] { Command.FORWARD };
		
		station.move(commands);
		
		assertEquals(rover.getPosition(), new Position(5, 6));
	}
	
	@Test
	public void being_at_center_after_move_five_step_to_north_rover_should_be_at_north_edge() {
		Command[] commands = new Command[] { 
				Command.FORWARD, 
				Command.FORWARD,
				Command.FORWARD, 
				Command.FORWARD, 
				Command.FORWARD
		};
		
		station.move(commands);
		
		assertEquals(rover.getPosition(), new Position(5, 10));
	}
	
	@Test
	public void being_heading_north_after_rotate_to_left_then_direction_is_west() {
		Command[] commands = new Command[] { 
			Command.LEFT
		};
		
		station.move(commands);
		
		assertEquals(rover.getPosition(), new Position(5, 5));
		assertEquals(rover.getDirection(), Direction.WEST);
	}
	
	@Test
	public void being_heading_north_after_rotate_to_right_then_direction_is_est() {
		Command[] commands = new Command[] { 
			Command.RIGHT
		};
		
		station.move(commands);
		
		assertEquals(rover.getPosition(), new Position(5, 5));
		assertEquals(rover.getDirection(), Direction.EAST);
	}
	
	@Test
	public void being_at_center_after_move_one_step_backward_rover_should_be_at_5_4() {
		Command[] commands = new Command[] { Command.BACKWARD };
		
		station.move(commands);
		
		assertEquals(rover.getPosition(), new Position(5, 4));
	}
	
	@Test
	public void being_at_center_after_turn_right_and_move_one_step_rover_should_be_at_6_5() {
		Command[] commands = new Command[] { Command.RIGHT, Command.FORWARD };
		
		station.move(commands);
		
		assertEquals(rover.getPosition(), new Position(6, 5));
	}
}
