package com.examplo.chatapp.controller;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.examplo.chatapp.model.ChatMessage;

@Controller
public class ChatController {


	// Método que controla o envio de mensagens
	@MessageMapping("/chat.sendMessage")
	@SendTo("/topic/public")
	public ChatMessage sendMessage(@Payload ChatMessage chatMessage){
		return chatMessage;
	}

	// Método que controla o acesso/inserção de usuarios na api.
	@MessageMapping("/chat.addUser")
	@SendTo("/topic/public")
	public ChatMessage addUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccesor) {

		//Possibilitar a inserção/adição de um userName e, consequentemente um novo usuario na websocket session.
		headerAccesor.getSessionAttributes().put("username", chatMessage.getSender());
		return chatMessage;
	}
	
}
