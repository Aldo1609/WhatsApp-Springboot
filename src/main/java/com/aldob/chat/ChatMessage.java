package com.aldob.chat;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatMessage {

    // Contiene el mensaje
    private String content;

    //Contiene el que envia el mensaje
    private String sender;

    // Contiene la accion que se realiza
    private MessageType type;

}
