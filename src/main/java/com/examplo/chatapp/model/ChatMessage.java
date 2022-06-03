package com.examplo.chatapp.model;

import java.awt.TrayIcon.MessageType;

public class ChatMessage {
	
	// Criação dos atributos 
	private MessageType type;
	private String content;
	private String sender;
	
	// Criação de um enum para definir o tipo construido.
	public enum MessageType{
		CHAT,
		JOIN,
		LEAVE
	}

	// Métodos acessores
	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}
	
}
