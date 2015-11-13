package fr.iutvalence.info.dut.m3105.labyrinthGame;

public class DumbRobotMaker implements RobotMaker{

	@Override
	public RobotArtificialIntelligence CreateRobot() {
		// TODO Auto-generated method stub
		return new DumbBotArtificialIntelligence();
	}

	
}
