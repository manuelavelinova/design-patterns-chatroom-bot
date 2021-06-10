package MediatorAndSingleton;

public class ChatUser extends User {

	public ChatUser(MessageMediator mediator, String username) {
		super(mediator, username);
		mediator.addUsers(this);//�� �� ������� ������� � ������ ���������
	}

	
	public void send(String message) {
		System.out.println(this.username + " sent: " + message);
		mediator.sendMessage(message, this);
		//���������� �� ����� �� ����������� �� �����������
	}

	
	public void receive(String message) {
		System.out.println(this.username + " received : " + message);


	}

}
