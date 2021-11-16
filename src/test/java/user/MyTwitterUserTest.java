package user;

import twitter.TwitterUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {
    MyTwitterUser user;

    @BeforeEach
    void setUp() {
        user = new MyTwitterUser(new TwitterUser("dogdog@gmail.com", "Ukraine", new Date()));
    }

    @Test
    void getUserMail() {
        assertEquals("dogdog@gmail.com", user.getUserMail());
    }

    @Test
    void getCountry() {
        assertEquals("Ukraine", user.getCountry());
    }

    @Test
    void getLastActiveTime() {
        long activeTimeMillis = user.getLastActiveTime().getTime();
        long currentTime = System.currentTimeMillis();
        assertTrue(currentTime >= activeTimeMillis);
    }
}