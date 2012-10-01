
package dip.lab3;

/**
 *
 * @author Greg Bahr
 * @version 2.0
 */
public class Startup {
    
    public static void main(String[] args) {
//        MessageProviderStrategy messageProvider = new ConsoleProviderStrategy();
//        MessageRendererStrategy messageRenderer = new ConsoleRendererStrategy();
//        
//        MessageService messageService = 
//                new MessageService(messageProvider, messageRenderer);
//        
//        messageService.processMessage();
//    }
    
        MessageProviderStrategy messageProvider = new GUIProviderStrategy();
        MessageRendererStrategy messageRenderer = new GUIRendererStrategy();
        
        MessageService messageService = 
                new MessageService(messageProvider, messageRenderer);
        
        messageService.processMessage();
    }
}