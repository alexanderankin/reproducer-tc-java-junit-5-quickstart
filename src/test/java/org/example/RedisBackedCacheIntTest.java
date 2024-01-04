package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// actually "RedisBackedCacheIntTestStep0"
// docker run --rm -p 6379:6379 -it redis:alpine
public class RedisBackedCacheIntTest {
    private RedisBackedCache underTest;

    @BeforeEach
    public void setUp() {
        // Assume that we have Redis running locally?
        underTest = new RedisBackedCache("localhost", 6379);
    }

    @Test
    public void testSimplePutAndGet() {
        underTest.put("test", "example");

        String retrieved = underTest.get("test");
        // assertThat(retrieved).isEqualTo("example");
        assertEquals("example", retrieved);
    }
}
