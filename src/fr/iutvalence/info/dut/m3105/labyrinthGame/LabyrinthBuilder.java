package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.HashSet;
import java.util.Set;

public class LabyrinthBuilder 
{
	private int width;
	private int height;
	private Position position;
	private Set<Position> forbiddenCellsPositions = new HashSet<Position>();
	

	public LabyrinthBuilder width(int width) throws InvalidParameterException
	{
		if (width <= 0)
		{
			throw new InvalidParameterException();
		}
		this.width = width;
		return this;
	}
	
	public LabyrinthBuilder height(int height) throws InvalidParameterException
	{
		if (height <= 0)
		{
			throw new InvalidParameterException();
		}
		this.height = height;
		return this;
	}
	
	public LabyrinthBuilder exitPosition(Position position) throws InvalidParameterException
	{
		if (position != null)
		{
			throw new InvalidParameterException();
		}
		this.position = position;
		return this;
	}
	
	public LabyrinthBuilder forbiddenCellsPositions(Position forbiddenPosition)
	{
		
		this.forbiddenCellsPositions.add(forbiddenPosition);
		return this;
	}
	
	public Labyrinth getLabyrinth()
	{
		return new Labyrinth(width, height, forbiddenCellsPositions, position);
	}
}