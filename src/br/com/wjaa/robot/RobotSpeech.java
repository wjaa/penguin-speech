package br.com.wjaa.robot;

import java.lang.Runnable;

/**
 *  RobotSpeech
 *
 */
public interface RobotSpeech extends Runnable{

	public void speak(String word);
	public String startListen();
	public void stopListen();

}
