package com.epst.epst.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.epst.epst.beans.MessageBean;

@Controller
public class chatController {
    
    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public String send(@Payload MessageBean message) throws Exception {
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return time; //"new OutputMessage(message.getFrom(), message.getText(), time)";
    }
}
