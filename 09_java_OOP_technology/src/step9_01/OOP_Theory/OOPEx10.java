package step9_01.OOP_Theory;

/*

	# 다형성
	
	- 다형성이란 하나의 메소드가 서로 다른 클래스에서 다양하게 실행되는 것을 말한다.
	- 다형성을 구현하기 위해서는 다형성을 구현할 메소드가 포함된 모든 클래스가 같은 부모 클래스를 가져야 한다.
	- 부모 클래스와 자식 클래스에 같은 메소드가 있어야 하며 자식 클래스는 이 메소드를 반드시 override 시켜서 사용해야 한다.
	- 부모 클래스 타입에 자식 클래스 타입을 대입시켜 다형성이 구현된 메소드를 실행한다.

*/



// 부모 클래스
class PolyShape {
	
	void draw() {} // 자녀 클래스가 상속받아서 오버라이딩할 메서드를 정의
	
}

class PolyLine extends PolyShape {
	
	void draw() {		// 부모 클래스를 자신에 맞게 재정의 하여 사용
		System.out.println("선을 그린다.");
	}
	
}

class PolyCircle extends PolyShape {
	
	void draw() {		// 부모 클래스를 자신에 맞게 재정의 하여 사용
		System.out.println("원을 그린다.");
	}
	
}

class PolyRect extends PolyShape{
	
	void draw() {		// 부모 클래스를 자신에 맞게 재정의 하여 사용
		System.out.println("사각형을 그린다.");
	}
	
}

public class OOPEx10 {

	public static void main(String[] args) {

		PolyShape[] shapes = {
								new PolyLine(),
								new PolyRect(),
								new PolyCircle()
							  };
		
		shapes[0].draw();	// 자식클래스의 재정의 된 메서드가 호출
		shapes[1].draw();	// 자식클래스의 재정의 된 메서드가 호출
		shapes[2].draw();	// 자식클래스의 재정의 된 메서드가 호출
		
	}

}




