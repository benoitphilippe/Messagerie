/**
 * 
 */
package callback;

import java.rmi.Remote;

/**
 * @author benoit
 *
 */
public interface Callback extends Remote {
	// show a message from user
	void receiveMessage(String user, String Message);
}
