package MediatorAndSingleton;

public abstract class User {
	
	protected MessageMediator mediator;//�� �� ����� ��� ��� ����  � ���������
	protected String username;
	
	public User(MessageMediator mediator,String username) {
		this.mediator = mediator;
		this.username = username;

	}
	public abstract void send(String message);
	
	public abstract void receive(String message);

}
