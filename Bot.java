package chatroomBot;

public class Bot extends AbstractUser {
	
	private static Bot _instance;
	
	 private Bot(IMediator<AbstractUser> mediator) {
		 super(mediator, _userName);
	 }
	 
	 public static Bot getInstance(IMediator<AbstractUser> mediator) {
		 if(_instance == null) {
			 _instance = new Bot(mediator);
		 }
		 return _instance;
	 }
	 
	 public void receive(String message,AbstractUser user) {
		 if(message.contains("cat")) {
			 getMediator().removeUser(user);
			 getMediator().send("The word cat is forbidden! ",this);
		 }
	 }

}
