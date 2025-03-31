package UserTest;

import user.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Usertest {

    @Test
    public void testCreateUser() {
        User user = new User("Adam", "password123");
    }

    @Test
    public void testGetUserName() {
        User user = new User("Adam", "password123");
        String expected = "Adam";
        String actual = user.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetPassword() {
        User user = new User("Adam", "password123");
        String expected = "password123";
        String actual = user.getPassword();
        assertEquals(expected, actual);
        System.out.println("password123");
    }
    @Test
    public void testSetUserName() {
        User user = new User("Adam", "password123");
        String expected = "Henry";
        user.setUserName("Henry");
        String actual = user.getName();
        assertEquals(expected, actual);
    }
}