package step9_01.OOP_Theory;

// Thread클래스를 상속받아서 쓰레드의 기능을 구현할 수 있다.
class Music extends Thread{
	
	boolean isPlayMusic = true;
	
	// Thread클래스로부터 제공되는 run()메서드 안에
	// 동시적으로 실행할 명령어를 기술하면 된다.
	
	@Override
	public void run() {
		while (isPlayMusic) {
			System.out.println("배경 음악이 연주되는 중.....");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
}

// Runnable 인터페이스를 구현하여 쓰레드 기능을 구현 할 수 있다.
class Game implements Runnable{

	boolean isPlayGame = true;
	
	@Override
	public void run() {
		
		while (isPlayGame) {
			System.out.println("신나게 게임을 하는 중.....");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
		
	}
	
}



public class OOPEx12 {

	public static void main(String[] args) {

		
		Music musicPlay = new Music();
		Game gamePlay = new Game();
		
		// Thread클래스를 상속받을 경우 객체에서 start()메서드를 이용하여 쓰레드를 시작한다.
		// 클래스 안에 오버라이딩 된 run() 메서드가 호출된다.
		musicPlay.start();
		
		// Runnable Interface를 구현할 경우 Thread객체를 생성하고 생성자의 인수로 
		// Runnable Interface를 구현한 객체를 주입한다.
		// Thread 객체를 통해 .start()메서드를 이용하여 스레드를 구현한다.
		
		Thread gameRun = new Thread(gamePlay);
		gameRun.start();
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("신나게 카톡을 하는 중");
			
			if (i == 8) {
				System.out.println("앗...엄마다!!!");
				System.out.println("엄마가 오셔서 게임과 음악을 종료합니다.");
				musicPlay.isPlayMusic = false;
				gamePlay.isPlayGame = false;
				break;
			}
			
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
			
		}
		
		
		
		
		
		
	}

}
