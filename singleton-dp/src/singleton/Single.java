package singleton;

public class Single {
	
	private static Single instance;
	private String message;
	
	private Single() {
	}
	
	public static Single getInstance() {
		if(instance == null) {
			instance = new Single();
		}
		return instance;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String toString() {
		return "Single{" + "mensagem = " + message + "}";
	}

}
