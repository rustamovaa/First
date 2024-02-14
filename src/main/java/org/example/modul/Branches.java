package org.example.modul;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Branches {
    public ReplyKeyboard menu(){
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();

        KeyboardButton food = new KeyboardButton();
        food.setText("\uD83E\uDD57Salat");
        KeyboardButton food1 = new KeyboardButton();
        food1.setText("\uD83C\uDF54Burger");
        KeyboardButton food2 = new KeyboardButton();
        food2.setText("\uD83C\uDF55Pitsa");
        KeyboardButton food3 = new KeyboardButton();
        food3.setText("\uD83E\uDED4Lavash");
        KeyboardButton food4 = new KeyboardButton();
        food4.setText("\uD83C\uDF5FKartoshka fri");
        KeyboardButton food5 = new KeyboardButton();
        food5.setText("\uD83C\uDF2EShaurma");
        KeyboardButton food6 = new KeyboardButton();
        food6.setText("\uD83D\uDD04Orqaga");

        row1.add(food);
        row1.add(food1);
        row2.add(food2);
        row2.add(food3);
        row3.add(food4);
        row3.add(food5);
        row4.add(food6);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);

        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        return markup;
    }
    public ReplyKeyboard start(){
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();

        KeyboardButton order = new KeyboardButton();
        order.setText("\uD83D\uDD79Buyurtma berish");
//        KeyboardButton back = new KeyboardButton();
//        back.setText("\uD83D\uDD04Orqaga");
        KeyboardButton seeMenu = new KeyboardButton();
        seeMenu.setText("\uD83C\uDF72Menyuni ko'rish");

        row1.add(order);
        row2.add(seeMenu);
//        row3.add(back);
        rowList.add(row1);
        rowList.add(row2);
//        rowList.add(row3);


        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        return markup;
    }

}

