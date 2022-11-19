package me.reputationdev.disception;

import me.reputationdev.disception.injector.ExceptionHandler;
import me.reputationdev.disception.util.DiscordWebhook;

public class Disception {

    public static DiscordWebhook webhook;
    public static void start(String webhookURL) {
        webhook = new DiscordWebhook(webhookURL);
        ExceptionHandler handler = new ExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(handler);
        Thread.currentThread().setUncaughtExceptionHandler(handler);
    }

    public static void exception(Throwable t) {
        Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), t);
    }
}
