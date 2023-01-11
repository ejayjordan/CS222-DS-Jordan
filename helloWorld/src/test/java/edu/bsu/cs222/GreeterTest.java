package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreeterTest {
    @Test
    public void testSayHello(){
        Greeter greeter = new Greeter();
        String result = greeter.sayHello();
        Assertions.assertEquals("Hello", result, "Greeter should say hello.");
    }
}
