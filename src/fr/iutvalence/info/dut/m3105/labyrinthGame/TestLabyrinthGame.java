package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.HashSet;
import java.util.Set;

/**
 * Test application for labyrinth game
 * 
 */
public class TestLabyrinthGame {
	/**
	 * Application's main
	 * 
	 * @param args
	 *            command-line arguments (none expected here)
	 * @throws InvalidParameterException 
	 */
	public static void main(String[] args) throws InvalidParameterException {
		Set<Position> blockPositions = new HashSet<Position>();
		blockPositions.add(new Position(2, 0));
		blockPositions.add(new Position(3, 0));
		blockPositions.add(new Position(0, 1));
		blockPositions.add(new Position(0, 1));
		blockPositions.add(new Position(1, 2));
		blockPositions.add(new Position(3, 2));
		blockPositions.add(new Position(3, 3));

		Labyrinth laby = new LabyrinthBuilder().width(4).height(4)
				.forbiddenCellsPositions(new Position(2, 0))
				.forbiddenCellsPositions(new Position(3, 0))
				.forbiddenCellsPositions(new Position(0, 1))
				.forbiddenCellsPositions(new Position(0, 1))
				.forbiddenCellsPositions(new Position(1, 2))
				.forbiddenCellsPositions(new Position(3, 2))
				.forbiddenCellsPositions(new Position(3, 3))
				.exitPosition(new Position(3, 1))
				.getLabyrinth();

		new LabyrinthGame(laby, RobotMaker.createRobot("LessDumb")).play();
	}
}
