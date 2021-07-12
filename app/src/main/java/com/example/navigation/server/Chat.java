package com.example.navigation.server;

import java.util.List;

public class Chat {
    private List<User> userList;
    private List<Message> messages;
    private String name;
    private Integer id;

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Chat(Integer id, List<User> userList,String name, List<Message> messages) {
        this.userList = userList;
        this.messages = messages;
        this.name = name;
        this.id = id;
    }

    public void addUser(User user){
        userList.add(user);
    }

    public List<User> getUserList() {
        return userList;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void addMessage(Message message){
        messages.add(message);
    }
}
