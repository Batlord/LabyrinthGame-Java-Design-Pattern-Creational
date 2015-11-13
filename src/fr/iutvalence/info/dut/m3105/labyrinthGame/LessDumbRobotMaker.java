package fr.iutvalence.info.dut.m3105.labyrinthGame;

public class LessDumbRobotMaker implements RobotMaker{

	@Override
	public RobotArtificialIntelligence CreateRobot() {
		// TODO Auto-generated method stub
		return new LesserDumbBotArtificialIntelligence();
	}


	
}
