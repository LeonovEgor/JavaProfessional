package Lesson2.Client.Actions;

import Lesson2.Messages.ChatMessage;

import java.util.ArrayList;
import java.util.List;

public class MessageListenersRegistrator {

    private List<MessageListener> listeners = new ArrayList<>();

    public void addListener(MessageListener listener){
        this.listeners.add(listener);
    }

    public void removeListener(MessageListener listener) {
        listeners.remove(listener);
    }

    public void fireAction(ChatMessage message){
        for (MessageListener listener : listeners) {
            listener.mlPerformAction(message);
        }
    }
}