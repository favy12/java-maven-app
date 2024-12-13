package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    
    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(8, app.add(5, 3));  // Test that 5 + 3 = 8
    }
}

