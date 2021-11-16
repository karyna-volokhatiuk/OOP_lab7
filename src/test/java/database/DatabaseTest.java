package database;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database database;

    @BeforeEach
    void setUp() {
        database = new Database();
    }

    @Test
    void getUserData() {
        assertEquals(database.getUserData(), "hello");
    }

    @Test
    void getStatisticData() {
        assertEquals(database.getStatisticData(), "hello2");
    }
}