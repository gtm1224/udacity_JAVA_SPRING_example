package com.example.demo.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageListService {
    private List<String> messages;
    @PostConstruct
    public void postConstruct(){
        this.messages = new ArrayList<>();
    }
    public MessageListService(){

    }
    public void addMessage(String message){
        messages.add(message);
    }
    public List<String> getMessages(){
        return new ArrayList<>(this.messages);
    }
}
