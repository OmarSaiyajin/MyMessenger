package com.example.navigation;

public class Items {
    private int imageRes;
    private String chatName;
    private String message;

    public Items(int imageRes, String chatName, String message) {
        this.imageRes = imageRes;
        this.chatName = chatName;
        this.message = message;
    }

    public int getImageRes() {
        return imageRes;
    }

    public String getChatName() {
        return chatName;
    }

    public String getMessage() {
        return message;
    }
}
