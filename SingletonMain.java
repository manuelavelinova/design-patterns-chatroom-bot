package MediatorAndSingleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton connection = Singleton.getInstance();
		
		connection.consumeMessage("Hi, I am the bott");
		
		

	}

}
