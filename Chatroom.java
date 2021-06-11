package chatroomBot;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Chatroom<T extends AbstractUser> implements IMediator<T> {
	
	private List<T> _users;
	
	public Chatroom() {
		_users = new CopyOnWriteArrayList<T>();
	}
	
	public void addUser(T user) {
		_users.add(user);
	}
	
	public void removeUser(T user) {
		_users.remove(user);
	}
	
	public void send(String message,T sender) {
		for(T user: _users) {
			if(user != sender) {
				user.receive(message,sender);
			}
		}
	}

}
