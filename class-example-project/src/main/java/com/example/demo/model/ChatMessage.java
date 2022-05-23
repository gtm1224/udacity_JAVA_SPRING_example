package com.example.demo.model;

public class ChatMessage {
    private String username;
    private String messageText;
    private Integer messageId;

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getMessageText(){
        return messageText;
    }
    public Integer getMessageId() {
        return messageId;
    }
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }
    public void setMessageText(String message){
        this.messageText = message;
    }
}
