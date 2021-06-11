package chatroomBot;

public class ChatroomMain {
	
	public static void main(String[] args) {
		
		IMediator<AbstractUser> mediator = new Chatroom<>();
		User user1 = new User(mediator, "Manuela");
		User user2 = new User(mediator, "Georgi");
		User user3 = new User(mediator, "Anabelle");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		
		user1.send("Hello");
		user2.send("Hi");
		user3.send("addBot");
		user1.send("Is there a cat here?");
		user3.send("oh no..."); 
	}
	

}
