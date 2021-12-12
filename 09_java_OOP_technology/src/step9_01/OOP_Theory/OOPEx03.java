package step9_01.OOP_Theory;

/*

	# 메서드 오버라이딩 ( Method Overriding )
	
	- 부모클래스로부터 상속 받은 메서드를 재정의(overriding)하여 사용한다.
	- 메서드 오버로딩과 혼용되기 쉽다.

*/


class Warrior2 extends Character {
	
	// 메서드 오버라이딩(메서드 재정의)
	void levelUp() {
		this.level++;
		this.power += 1000;
		this.dex   += 500;
		this.life  += 1000;
		this.mana  += 100;
		System.out.println("# 레벨업 하였습니다. 현재 레벨 : " + this.level);
	}
	
	// Warrior2 클래스만의 메서드 추가
	void dash() {
		System.out.println("# dash!");
	}
	
	
}

class Wizard2 extends Character {
	
	// 메서드 오버라이딩(메서드 재정의)
	void levelUp() {
		this.level++;
		this.power += 100;
		this.dex   += 500;
		this.life  += 100;
		this.mana  += 3000;
		System.out.println("# 레벨업 하였습니다. 현재 레벨 : " + this.level);
	}
	
	// Wizard2 클래스만의 메서드 추가
	void fireball() {
		System.out.println("# fireball! ");
	}
	
	
}


public class OOPEx03 {

	public static void main(String[] args) {

		Warrior2 war1 = new Warrior2();
		
		war1.dash();
		war1.dash();
		war1.dash();
		
		war1.showStatus();
		war1.levelUp();
		war1.showStatus();
		
		System.out.println("==================");
		
		Wizard2 wiz1 = new Wizard2();
		
		wiz1.fireball();
		wiz1.fireball();
		wiz1.fireball();
		
		wiz1.showStatus();
		wiz1.levelUp();
		wiz1.levelUp();
		wiz1.levelUp();
		wiz1.showStatus();
		
	}

}
