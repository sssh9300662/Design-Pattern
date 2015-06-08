package design.creation.simplefactory;

import junit.framework.Assert;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import design.example.objects.Message;
import design.example.objects.Session;

public class SimpleFactoryTest {

    @Test
    public void testGetMessage() {
        Session session = new Session();
        session.setSubject("Test");
        
        Message message = SimpleFactory.getMessage(session);
        Assert.assertTrue(StringUtils.equals(session.getSubject(), message.getSubject()));
    }

}
