/**
 * 
 */
package callback;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author benoit
 *
 */
public abstract class CallbackImpl extends UnicastRemoteObject implements Callback {
	
	private static final long serialVersionUID = 599224222342605318L;

	/**
	 * @throws RemoteException
	 */
	public CallbackImpl() throws RemoteException {
		
	}

	/* (non-Javadoc)
	 * @see callback.Callback#showMessage(java.lang.String, java.lang.String)
	 */
	public abstract void receiveMessage(User user, String message);

}
