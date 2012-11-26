package br.com.wjaa.main;

import br.com.wjaa.robot.RobotBuilder;
import br.com.wjaa.robot.RobotSpeech;

public class MainSpeech{

	
	public static void main(String args[]){
		RobotBuilder b = new RobotBuilder(null);
		RobotSpeech r = b.create();
		
		r.startListen();
	} 


}
