package MediatorAndSingleton;

public class ChatUser extends User {

	public ChatUser(MessageMediator mediator, String username) {
		super(mediator, username);
		mediator.addUsers(this);//за да добавим чатюзер в месидж медиатора
	}

	
	public void send(String message) {
		System.out.println(this.username + " sent: " + message);
		mediator.sendMessage(message, this);
		//Медиаторът се грижи за изпращането на съобщението
	}

	
	public void receive(String message) {
		System.out.println(this.username + " received : " + message);


	}

}
