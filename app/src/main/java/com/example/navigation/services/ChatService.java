package com.example.navigation.services;

import android.os.Build;

import androidx.annotation.RequiresApi;


import com.example.navigation.server.Chat;
import com.example.navigation.server.ChatServer;
import com.example.navigation.server.Message;
import com.example.navigation.server.User;

import java.util.List;

public class ChatService {

    public ChatService(){};

    @RequiresApi(api = Build.VERSION_CODES.N)
    public List<Chat> getAllChatsForUser(User user){
       return ChatServer.instance().getAllChatsForUser(user);
    }

    public void sendChatMessage(Integer id, Message message){
        ChatServer.instance().addChatMessage(id, message);
    }

    public Chat createNewChat(List<User> users, String name){
        return ChatServer.instance().createNewChat(users, name);
    }
}
