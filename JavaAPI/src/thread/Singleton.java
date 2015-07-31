package thread;

//getInstance();

public class Singleton {
	/*필드*/
	
	private static Singleton singleton = new Singleton(); 
	/*생성자*/
	private Singleton() { //싱글톤에서는 생성자를 private으로 은닉화시킨다.
		System.out.println("인스턴스 생성");
	}
	/*멤버메소드*/
	public static Singleton getInstance(){
		
		return singleton;
	}
	

}
