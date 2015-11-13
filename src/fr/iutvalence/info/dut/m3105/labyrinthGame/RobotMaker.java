package fr.iutvalence.info.dut.m3105.labyrinthGame;

public class RobotMaker {

	public static RobotArtificialIntelligence createRobot(String typerobot)
	{
		if (typerobot.equals("Dumb")){
			
			return new DumbRobotMaker().CreateRobot();
		}

		if (typerobot.equals("LessDumb")){
			
			return new LessDumbRobotMaker().CreateRobot();
		}
		
			return null;
		
	}
}
