package chatroomBot;

public class User extends AbstractUser {
	
	private String _userName;
	
	public User(IMediator<AbstractUser> mediator, String userName) {
		super(mediator,userName);
		_userName = userName;
	}

	@Override
	public void receive(String message, AbstractUser user) {

		System.out.println(_userName + "- message received: " + message);
	}

}
