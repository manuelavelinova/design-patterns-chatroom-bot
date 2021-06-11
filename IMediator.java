package chatroomBot;

public interface IMediator<T> {

	void send(String message, T user);
	void addUser(T user);
	void removeUser(T user);

}
