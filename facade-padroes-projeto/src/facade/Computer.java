package facade;

import hardware.*;

public class Computer {
	
	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;
	private WebCam webcam;
	private Impressora impressora;
	
	public Computer() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.hardDrive = new HardDrive();
		this.webcam = new WebCam();
		this.impressora = new Impressora();
	}
	
	public void startComputer() {
		cpu.freeze();
		memory.load(1, hardDrive.read(2, 3));
		cpu.jump(1);
		cpu.execute();
		webcam.conecta();
		impressora.ligarImp();
	}

}


