package design.creation.simplefactory;

import design.example.objects.Message;
import design.example.objects.Session;

public class SimpleFactory {

    public static Message getMessage(Session session) {
        Message msg = new Message(session);
        msg.setSubject(session.getSubject());
        msg.setText(session.getText());
        msg.setDate(session.getDate());
        return msg;
    }

}
