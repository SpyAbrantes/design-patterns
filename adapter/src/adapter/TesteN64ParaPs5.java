package adapter;

public class TesteN64ParaPs5 {

	public static void main(String[] args) {
		
		SensorPS5 adaptador = new SensorPS5();
		
		ControleNintendo64 target = new ControleNintendo64();
		
		AdaptadorNintendo64ParaPS5 adapter = new AdaptadorNintendo64ParaPS5(adaptador);
		
		target.Conectar(adapter);
		
		
	}

}
