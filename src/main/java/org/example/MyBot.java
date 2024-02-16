package org.example;

import org.example.modul.BotState;
import org.example.modul.Branches;
import org.example.modul.User;
import org.example.service.impl.UserServiceImpl;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;

public class MyBot extends TelegramLongPollingBot {
    public MyBot(String botToken) {
        super(botToken);
    }

    Branches branches = new Branches();
    UserServiceImpl userService = new UserServiceImpl();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String text = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            if (text.equals("/start")) {
                SendMessage message = new SendMessage();
                message.setText("Assalomu Alaykum!\nBotimizga xush kelibsiz!\nQuyida berilgan tugmalardan birini tanlang!");
                message.setReplyMarkup(branches.start());
                System.out.println("branches.start");
                message.setChatId(chatId);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            } else if (text.equals("\uD83D\uDD04Orqaga")) {
                SendMessage message = new SendMessage();
                message.setText("Bosh menyuga xush kelibsiz. Quyidagilardan birini tanlang");
                message.setChatId(chatId);
                message.setReplyMarkup(branches.start());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("\uD83C\uDF72Menyuni ko'rish")) {
                SendMessage message = new SendMessage();
                message.setText("Menyuni ko'rish uchun quyidagi tugmalardan birini tanlang!");
                message.setChatId(chatId);
                message.setReplyMarkup(branches.menu());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("\uD83E\uDD57Salat")) {
                InputFile file = new InputFile(new File("C:\\Users\\Mirziyod\\Pictures\\salad.jpg"));
                SendPhoto photo = new SendPhoto();
                photo.setPhoto(file);
                photo.setCaption("\uD83E\uDD57Salat\n\uD83E\uDD6CKaram\n\uD83E\uDD52Bodring\n\uD83E\uDD5CYong'oq");
                photo.setChatId(chatId);
                try {
                    execute(photo);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83C\uDF54Burger")) {
                InputFile file = new InputFile(new File("C:\\Users\\Mirziyod\\Pictures\\Burger King Whoppers.jpg"));
                SendPhoto photo = new SendPhoto();
                photo.setPhoto(file);
                photo.setCaption("\uD83C\uDF54Burger\n\uD83E\uDD6CKaram\n\uD83E\uDD52Bodring\n\uD83E\uDD69Go'sht\n\uD83E\uDDC5Piyoz\n\uD83E\uDDC0Pishloq");
                photo.setChatId(chatId);
                try {
                    execute(photo);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83C\uDF55Pitsa")) {
                InputFile file = new InputFile(new File("C:\\Users\\Mirziyod\\Pictures\\pizza.jpg"));
                SendPhoto photo = new SendPhoto();
                photo.setPhoto(file);
                photo.setCaption("\uD83C\uDF55Pizza\n\uD83E\uDD60Hamir\n\uD83E\uDDC0Pishloq\n\uD83C\uDF57Tovuq go'shti\n\uD83E\uDD6BPizza qaylasi");
                photo.setChatId(chatId);
                try {
                    execute(photo);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83E\uDED4Lavash")) {
                InputFile file = new InputFile(new File("C:\\Users\\Mirziyod\\Pictures\\lavash.jpg"));
                SendPhoto photo = new SendPhoto();
                photo.setPhoto(file);
                photo.setCaption("\uD83C\uDF2FLavash\n\uD83E\uDD6CKaram\n\uD83E\uDD52Bodring\n\uD83E\uDDC0Pishloq\n\uD83E\uDD60Hamir\n\uD83E\uDD69Go'sht");
                photo.setChatId(chatId);
                try {
                    execute(photo);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83C\uDF5FKartoshka fri")) {
                InputFile file = new InputFile(new File("C:\\Users\\Mirziyod\\Pictures\\fri.jpg"));
                SendPhoto photo = new SendPhoto();
                photo.setPhoto(file);
                photo.setCaption("\uD83C\uDF5FKartoshka fri\n\uD83E\uDD54Kartoshka");
                photo.setChatId(chatId);
                try {
                    execute(photo);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83C\uDF2EShaurma")) {
                InputFile file = new InputFile(new File("C:\\Users\\Mirziyod\\Pictures\\shaurma.jpg"));
                SendPhoto photo = new SendPhoto();
                photo.setPhoto(file);
                photo.setCaption("\uD83C\uDF2EShaurma\n\uD83E\uDD6CKaram\n\uD83E\uDD52Bodring\n\uD83C\uDF46Baqlajon\n\uD83E\uDDC5Piyoz\n\uD83E\uDD69Go'sht");
                photo.setChatId(chatId);
                try {
                    execute(photo);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


        } else if (update.hasCallbackQuery()) {
            long chatId = update.getMessage().getChatId();
            User user = userService.get(chatId);
            String data = update.getCallbackQuery().getData();
            long callBackId = update.getCallbackQuery().getMessage().getChatId();
            if (data.equals("")) {
                user.setState(BotState.SALADS);
                EditMessageText text = new EditMessageText();
                text.setMessageId(update.getCallbackQuery().getInlineMessageId());
                text.setText("Quyidagi menyulardan birini tanlang");
                try {
                    execute(text);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

        @Override
        public String getBotUsername () {
            return "MuFiDu_kitchen_bot";
        }

    }
