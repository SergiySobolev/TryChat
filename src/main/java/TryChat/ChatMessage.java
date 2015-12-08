package TryChat;

import lombok.Data;

import java.util.Date;

@Data
public class ChatMessage {
    private String message;
    private String sender;
    private Date received;
}
