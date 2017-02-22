/**
 * 
 */
package callback;

import java.util.Observable;
import java.util.Observer;

/**
 * @author benoit
 *
 */
public abstract class ConversationObserver implements Observer {

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public abstract void update(Observable arg0, Object arg1);

}
