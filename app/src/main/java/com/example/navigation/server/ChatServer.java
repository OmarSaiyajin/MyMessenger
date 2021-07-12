package com.example.navigation.server;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChatServer {
    private Map<Integer, Chat> chatMap = new HashMap<>();

    private static ChatServer chatServer = new ChatServer();

    private ChatServer(){};

    public static ChatServer instance(){
        return chatServer;
    }

    public Map<Integer, Chat> getChatMap() {
        return chatMap;
    }

    public void setChatMap(Map<Integer, Chat> chatMap) {
        this.chatMap = chatMap;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public List<Chat> getAllChatsForUser(User user){


        return chatMap.entrySet().stream().map(e -> e.getValue()).filter(e -> e.getUserList().contains(user)).collect(Collectors.toList());
    }

    public void addChatMessage(Integer id,  Message message){
        if(chatMap.containsKey(id)){
            chatMap.get(id).addMessage(message);
        }
    }

    public Chat createNewChat(List<User> users, String name){
        Chat chat = new Chat(chatMap.size()+1, users, name, new ArrayList<>());
        chatMap.put(chatMap.size()+1, chat);
        return chat;
    }
}
