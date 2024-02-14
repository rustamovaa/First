package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        TelegramBotsApi api = null;

        try {
            api = new TelegramBotsApi(DefaultBotSession.class);
            api.registerBot(new MyBot("6821233184:AAHiYaO7n-_z1YrJLDs3ze6y-Mc6xCbXyqY"));
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}