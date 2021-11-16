package database;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {
    Authorization authorization;

    @BeforeEach
    void setUp() {
        authorization = new Authorization();
    }

    @Test
    void logIn() {
        assertTrue(authorization.logIn(new Database()));
    }
}