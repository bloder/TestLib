package br.com.bloder.messagelib;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bloder on 06/02/16.
 */
public class MessageProvider {

    public static List<Message> fetchMessages() {
         List<Message> messages = new ArrayList<>();
        for(int i = 0; i<20; i++) {
            messages.add(new Message(
                    "Title: "+String.valueOf(i)+"",
                    "Message: "+String.valueOf(i)+""
            ));
        }
        return messages;
    }
}
