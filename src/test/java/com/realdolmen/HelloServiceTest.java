package com.realdolmen;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloServiceTest {

    @Test
    public void testSayHello() {
        HelloService hello = new HelloService();
        String result = hello.sayHello("Simon");
        assertEquals("Hello Simon", result);

    }

}
