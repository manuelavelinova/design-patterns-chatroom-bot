package MediatorAndSingleton;

import java.util.ArrayList;
import java.util.List;

public class Chatroom implements MessageMediator
{
	
	private List<User> users; //списък с юзърите
	
	public Chatroom() {
		this.users = new ArrayList<>();
	}

	public void addUsers(User user) {
		
		this.users.add(user);

	}
	public void removeUsers(User user) {
		this.users = null;
	}
	
	
	public void isThereCatWord(User user, String message) {
		if(message.contains("cat")) {
			removeUsers(user);
			
		}
	}
	public void sendMessage(String message,User user) {
		for(User chatUser: this.users) {
			if(user != chatUser) {
				//if(message == "addBot") {
					//Singleton bot = Singleton.getInstance();
					chatUser.receive(message);
					
					
				}
				
					
					//System.out.println("A bot has been added to this chat. ");
				}
			
			
			
			//обхождаме юзърите, за да получат съобщението
		}

	}


