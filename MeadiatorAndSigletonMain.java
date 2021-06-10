package MediatorAndSingleton;

public class MeadiatorAndSigletonMain {

	public static void main(String[] args) {
		
		MessageMediator chatroom = new Chatroom();
		
		User user1 = new ChatUser(chatroom,"Manuela");
		User user2 = new ChatUser(chatroom,"Georgi");
		User user3 = new ChatUser(chatroom,"Anabelle");
		
		//Singleton connection = Singleton.getInstance();
		
		//connection.consumeMessage("Hi, I am the bott");
		//Singleton boot = Singleton.getInstance("FOO");
		
		user2.send("addBot");

	}
		
	
}
