package singleton;

public class Main {

	public static void main(String[] args) {
		
		//Single s = new Single(); N�O COMPILA!!!!
		
		Single s1 = Single.getInstance();
		s1.setMessage("Eu sou uma classe �nica");
		
		Single s2 = Single.getInstance();
		
		if(s1 == s2) {
			System.out.println("s1 e s2 s�o mesmo objeto!");
			System.out.println(s1);
			System.out.println(s2);
		}
	}

}
