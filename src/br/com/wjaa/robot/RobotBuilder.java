package br.com.wjaa.robot;

import java.util.Locale;


/**
 * 
 * @author wagner
 *
 */
public class RobotBuilder {

	private static RobotStrategy robotStrategy;
	
	static{
		robotStrategy = new RobotStrategy();
		robotStrategy.setLocale(new Locale("ptbr"));
	}
	
	
	public RobotBuilder(RobotStrategy robotStrategy){
		
		if (robotStrategy != null){
			RobotBuilder.robotStrategy = robotStrategy;
		}
		
	}
	
	public RobotSpeech create(){
		//TODO USAR O STRATEGY AQUI PARA MONTAR O ROBO CORRETO.
		return new RobotSpeechGenericImpl();
	}
	
}
