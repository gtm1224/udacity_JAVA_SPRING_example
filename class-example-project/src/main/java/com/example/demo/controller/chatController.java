package com.example.demo.controller;

import com.example.demo.model.ChatForm;
import com.example.demo.service.messageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class chatController {
    private messageService message_service;
    public chatController(messageService message_service){
        this.message_service = message_service;
    }
    @GetMapping
    public String getChatPage(ChatForm chatForm, Model model){
        model.addAttribute("chatMessages",this.message_service.getChatMessages());
        return "chat";
    }
    @PostMapping
    public String postChatMessage(ChatForm chatForm, Model model){
        this.message_service.addMessage(chatForm);
        chatForm.setMessageText("");
        model.addAttribute("chatMessages",this.message_service.getChatMessages());
        return "chat";
    }

    @ModelAttribute("allMessageTypes")
    public String[] allMessageTypes(){
        return new String[] {"Say","Shout","Whisper"};
    }



}
