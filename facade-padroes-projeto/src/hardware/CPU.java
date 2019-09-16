package hardware;

public class CPU {

	public void freeze() {
		System.out.println("Inicializando Freeze");
	}
	public void jump (long position) {
		System.out.println("Jump em andamento");
	}
	public void execute() {
		System.out.println("Executando CPU");
	}
}
