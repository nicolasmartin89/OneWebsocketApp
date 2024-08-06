package com.app.onewebsocketapp.chat;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatNotification {
    private String id;
    private String senderID;
    private String recipientID;
    private String content;

}
