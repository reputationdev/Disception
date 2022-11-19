package me.reputationdev.disception;

import java.util.ArrayList;

public class TestApp {
    public static void main(String[] args) {

        Disception.start("https://discord.com/api/webhooks/1043614949399863447/_QlWQBhqXFBdm8DLbdEBb91DYPqwCGA36LGkSFFEbApIsHs-3mJ5ZBmC2bcdgPqsvuE8");

        try {
            ArrayList<String> list = new ArrayList<>();
            list.get(-1);
        } catch (Exception e) {
            Disception.exception(e);
        }
        ArrayList<String> list = new ArrayList<>();

        if (list.hashCode() == 1) {
            list.get((int) ((int) 7f * (-.9f)));
        }

        System.out.println(10/0);
        System.out.println((int)Math.sqrt(-1));


    }
}