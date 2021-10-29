package ru.kibedov.lifer.adapter.telegram.bot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Телеграмм бот
 */
@Component
public class LiferBot extends TelegramLongPollingBot {
    @Value("setting.telegram.bot.username")
    private String tgBotUsername;
    @Value("setting.telegram.bot.token")
    private String tgBotToken;

    @Override
    public String getBotUsername() {
        return tgBotUsername;
    }

    @Override
    public String getBotToken() {
        return tgBotToken;
    }

    @Override
    public void onUpdateReceived(Update update) {

    }
}
