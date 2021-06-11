package chatroomBot;

public abstract class AbstractUser {

	private IMediator<AbstractUser> _mediator;
	protected static String _userName;
	
	public AbstractUser(IMediator<AbstractUser> mediator,String userName) {
		_mediator = mediator;
		_userName = userName;
	}
	
//	public AbstractUser(IMediator<AbstractUser> mediator) 
	//	_mediator = mediator;
	//}

	public abstract void receive(String message, AbstractUser user);
	
	public void send(String message) {
		//System.out.println(userName + " sent: " + message);
		if ("addBot".equals(message)) {
	
			_mediator.addUser(Bot.getInstance(_mediator));
			
		}
		_mediator.send(message, this);
		
	}
	
	public IMediator<AbstractUser> getMediator() {
		return _mediator;
	}
	public String getUserName() {
		return _userName;
	}

}
