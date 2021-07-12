package com.example.navigation.server;

public class Message {
    private String message;
    private User user;
    private boolean favorite;

    public Message(String message, User user, boolean favorite) {
        this.message = message;
        this.user = user;
        this.favorite = favorite;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
