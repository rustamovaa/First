package org.example;

import org.example.modul.Branches;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
    public MyBot(String botToken) {
            super(botToken);
        }

        Branches branches = new Branches();

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


                }
                else if (text.equals("\uD83D\uDD04Orqaga")) {
                    SendMessage message = new SendMessage();
                    message.setText("Bosh menyuga xush kelibsiz. Quyidagilardan birini tanlang");
                    message.setChatId(chatId);
                    message.setReplyMarkup(branches.start());

                    try {
                        execute(message);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }

                }
                else if (text.equals("\uD83C\uDF72Menyuni ko'rish")) {
                    SendMessage message = new SendMessage();
                    message.setText("Menyuni ko'rish uchun quyidagi tugmalardan birini tanlang!");
                    message.setChatId(chatId);
                    message.setReplyMarkup(branches.menu());

                    try {
                        execute(message);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }

                }
                else  if (text.equals("\uD83E\uDD57Salat")) {
                    InputFile file = new InputFile("C:\\Users\\ASUS\\Desktop\\projectPhotos\\project.jpg");
                    SendPhoto photo = new SendPhoto();
                    photo.setPhoto(file);
                    photo.setCaption("\uD83E\uDD57Salat\n\uD83E\uDD6CKaram\n\uD83E\uDD52Bodring\n\uD83C\uDF46Rediska");
                    photo.setChatId(chatId);
                    try {
                        execute(photo);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                else if (text.equals("\uD83C\uDF54Burger")){
                    InputFile file = new InputFile("C:\\Users\\ASUS\\Desktop\\projectPhotos\\burger.jpg");
                    SendPhoto photo = new SendPhoto();
                    photo.setPhoto(file);
                    photo.setCaption("\uD83E\uDD57Salat\n\uD83E\uDD6CKaram\n\uD83E\uDD52Bodring\n\uD83C\uDF46Rediska");
                    photo.setChatId(chatId);
                    try {
                        execute(photo);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                else if (text.equals("\uD83C\uDF55Pitsa")){
                    InputFile file = new InputFile("C:\\Users\\ASUS\\Desktop\\projectPhotos\\images.jpeg");
                    SendPhoto photo = new SendPhoto();
                    photo.setPhoto(file);
                    photo.setCaption("\uD83E\uDD57Salat\n\uD83E\uDD6CKaram\n\uD83E\uDD52Bodring\n\uD83C\uDF46Rediska");
                    photo.setChatId(chatId);
                    try {
                        execute(photo);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                else if (text.equals("\uD83E\uDED4Lavash")){
                    InputFile file = new InputFile("C:\\Users\\ASUS\\Desktop\\projectPhotos\\lavash.jpeg");
                    SendPhoto photo = new SendPhoto();
                    photo.setPhoto(file);
                    photo.setCaption("\uD83E\uDD57Salat\n\uD83E\uDD6CKaram\n\uD83E\uDD52Bodring\n\uD83C\uDF46Rediska");
                    photo.setChatId(chatId);
                    try {
                        execute(photo);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                else if (text.equals("\uD83C\uDF5FKartoshka fri")){
                    InputFile file = new InputFile("C:\\Users\\ASUS\\Desktop\\projectPhotos\\kartoshka.jpg");
                    SendPhoto photo = new SendPhoto();
                    photo.setPhoto(file);
                    photo.setCaption("\uD83E\uDD57Salat\n\uD83E\uDD6CKaram\n\uD83E\uDD52Bodring\n\uD83C\uDF46Rediska");
                    photo.setChatId(chatId);
                    try {
                        execute(photo);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                else if (text.equals("\uD83C\uDF2EShaurma")){
                    InputFile file = new InputFile("C:\\Users\\ASUS\\Desktop\\projectPhotos\\shaurma.jpeg");
                    SendPhoto photo = new SendPhoto();
                    photo.setPhoto(file);
                    photo.setCaption("\uD83E\uDD57Salat\n\uD83E\uDD6CKaram\n\uD83E\uDD52Bodring\n\uD83C\uDF46Rediska");
                    photo.setChatId(chatId);
                    try {
                        execute(photo);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }


            } else if (update.hasCallbackQuery()) {
            }
        }

        @Override
        public String getBotUsername() {
            return "https://t.me/MuFiDu_kitchen_bot";
        }

    }
