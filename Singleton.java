package MediatorAndSingleton;

import java.util.List;

public class Singleton  {
	
	private static Singleton instance;
	private List<User> users;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {

		if(instance == null) {
			instance = new Singleton();
			
		}
		
		return instance;
	}
	
	public void consumeMessage(String message) {
		//if (message.contains("cat")) {
			//users.removeUsers();
		
			
		System.out.println("Message from singleton instance : " + message);
		
	}

	@Override
	public void addUsers(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMessage(String message, User user) {
		// TODO Auto-generated method stub
		
	}

	
	}
	

}
