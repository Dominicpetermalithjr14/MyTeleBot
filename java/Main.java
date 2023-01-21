package com.mytel.myteleg;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramApi;
import org.telegram.telegram.telegrambots.exceptions.TelegramApiException;
public class Main {
    public static void main(String[] args) {
     //initialize Api context
     ApiContextInitializer.init();
     
     TelegramBots botsApi=new TelegramBotsApi();
     
     
     try{
         botsApi.registerBot(new MyWonderfulBot());
     }catch (TelegramApiException e) {
         e.printStackTree();
     }
    }
}
    
