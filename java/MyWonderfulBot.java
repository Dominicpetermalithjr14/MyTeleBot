

/**
 *
 * @author Peterson
 */



import org.telegrambots.api.methods.send.SendMessage;
import org.telegrambots.api.objects.Update;
import org.telegrambots.bots.TelegramLongPollingBot;
import org.telegrambots.exceptions.TelegramApiException;

public class MyWonderfulBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update){
    if(update.hasMessage()&& update.getMessage().hasText()){
        String message-text=update.getMessage().getText();
        long chat-id=update.getMessage().getChatId();
        
        
        SendMessage message=new SendMessage()
                .setChatId(chat-id)
                .setText(message=text);
        
        try {
            execute(message);
        } catch(TelegramApiException e){
            e.printStackTree();
        }
    }
    
        @Override
    public String getBotUsername(){
        return "peteSon-jr";
    }
        @Override
    public String getBotToken(){
        return "BotFather";
    }
    
}
