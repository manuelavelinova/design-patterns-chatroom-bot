package MediatorAndSingleton;

public interface MessageMediator {

	void addUsers(User user);
	
	void sendMessage(String message,User user);
}
