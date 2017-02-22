/**
 * 
 */
package callback;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Queue;

/**
 * @author benoit
 *
 */
public class Conversation extends Observable {
	
	/**
	 * contain all the message
	 */
	private Queue<String> messages;
	private User toUser;
	
	public Conversation(User toUser) {
		this.messages = new LinkedList<String>();
		this.toUser = toUser;
	}
	
	public void add(String User, String message){
		if(this.messages.add(User + ": " + message)){
			// conversation changed
			this.setChanged();
		}
		this.notifyObservers(message);
	}
	
	@Override
	public String toString() {
		String conv = "";
		Iterator<String> it = this.messages.iterator();
		while(it.hasNext()){
			conv += it.next();
		}
		return conv;
	}
}
