package modelo;

import facade.Computer;

public class You {
	
	public static void main(String[] args) {
		Computer facade = new Computer();
		facade.startComputer();
	}

}
