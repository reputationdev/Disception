package me.reputationdev.disception.injector;

import me.reputationdev.disception.Disception;
import me.reputationdev.disception.util.DiscordWebhook;

import java.awt.*;
import java.io.IOException;

public class ExceptionHandler implements Thread.UncaughtExceptionHandler {

    public void uncaughtException(Thread t, Throwable e) {
        Disception.webhook.addEmbed(new DiscordWebhook.EmbedObject()
                .setTitle("Error Logging")
                .setDescription("An error has occurred in the application.")
                .addField("Error", e.toString(), false)
                .addField("Thread", t.getName(), false)
                .setColor(new Color(0xFF0000)));
        try {
            Disception.webhook.execute();
        } catch (IOException ex) {
            System.out.println("Error sending webhook message. (Invalid URL?)");
            System.exit(1);
        }
    }
}
