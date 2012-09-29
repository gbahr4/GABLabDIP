
package dip.lab3;

/**
 *
 * @author Greg Bahr
 * @version 1.0
 */
public class MessageService {
    
    private MessageProviderStrategy messageProvider;
    private MessageRendererStrategy messageRenderer;

    public MessageService(MessageProviderStrategy messageProvider, 
            MessageRendererStrategy messageRenderer) {
        this.messageProvider = messageProvider;
        this.messageRenderer = messageRenderer;
    }
    
    public void processMessage() {
        String line = messageProvider.readInput();
        messageRenderer.writeOutput(line);
    }
}