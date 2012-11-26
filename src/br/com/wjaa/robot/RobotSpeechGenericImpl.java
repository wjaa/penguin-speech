package br.com.wjaa.robot;

class RobotSpeechGenericImpl extends Thread implements RobotSpeech{

	
	private boolean listenComplete = false;
	private String word = "";
	
	@Override
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.word = "aa";
		this.listenComplete = true;
		
		
	}

	@Override
	public void speak(String word) {
		//TODO ENVIAR A PALAVRA PARA A API FALAR
		
	}

	@Override
	public String startListen() {
		this.start();

		while (!this.listenComplete){
			System.out.println("Aguardando por commando...");
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		//pensar se ela falará o que ela entendeu.
		this.speak(this.word);
		System.out.println("Palavra reconhecida = " + this.word);
		this.stopListen();
		return this.word;
	}

	@Override
	public void stopListen() {
		this.listenComplete = true;
		this.word = "";
		
	}

}
