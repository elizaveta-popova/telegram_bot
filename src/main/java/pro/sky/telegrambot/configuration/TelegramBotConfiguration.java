package pro.sky.telegrambot.configuration;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.DeleteMyCommands;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TelegramBotConfiguration {
//    @Bean
//    public TelegramBot telegramBot(@Value("6204165945:AAGTfDssSfu53eqs_8b88oIzv6Ftd0dcVNM") String token) {
//        return new TelegramBot(token);
//    }


    @Value("6204165945:AAGTfDssSfu53eqs_8b88oIzv6Ftd0dcVNM")
    private String token;

    @Bean
    public TelegramBot telegramBot() {
        TelegramBot bot = new TelegramBot(token);
        bot.execute(new DeleteMyCommands());
        return bot;
    }

}
