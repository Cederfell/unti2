import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testUser {

    @Test
    public void testCreateUser() {
        User user = new User("Martin", "Hej12");
    }

    @Test
    public void testGetUserName() {
        User user = new User("Martin", "Hej12");
        String expected = "Martin";
        String actual = user.getUserName();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetPassword() {
        User user = new User("Martin", "Hej12");
        String expected = "Hej123";
        String actual = user.getPassword();
        assertEquals(expected, actual);
    }
    @Test
    public void testSetUserName() {
        User user = new User("Martin", "Hej12");
        String expected = "Anna";
        user.setUserName("Anna");
        String actual = user.getUserName();
        assertEquals(expected, actual);
    }
}
