package adapter;

public class AdaptadorNintendo64ParaPS5 extends SensorNintendo64{
	
	private SensorPS5 adaptee;
	
	public AdaptadorNintendo64ParaPS5(SensorPS5 adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void ConectarN64() {
		adaptee.conectarPS5();
		System.out.println("Zelda!");
	}

}
