package com.kata.foobarquix.services;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FooBarQuixServiceTest {
    private FooBarQuixService fooBarQuixService;

    public FooBarQuixServiceTest() {
        this.fooBarQuixService = new FooBarQuixService();
    }

    @Test
    public void convertNumber1ShouldReturn1() {
        assertEquals("1", fooBarQuixService.convertNumber(1));
    }

    @Test
    public void convertNumber3ShouldReturnFooFoo() {
        assertEquals("FooFoo", fooBarQuixService.convertNumber(3));
    }

    @Test
    public void convertNumber5ShouldReturnBarBar() {
        assertEquals("BarBar", fooBarQuixService.convertNumber(5));
    }

    @Test
    public void convertNumber7ShouldReturnQuix() {
        assertEquals("Quix", fooBarQuixService.convertNumber(7));
    }

    @Test
    public void convertNumber9ShouldReturnFoo() {
        assertEquals("Foo", fooBarQuixService.convertNumber(9));
    }

    @Test
    public void convertNumber51ShouldReturnFooBar() {
        assertEquals("FooBar", fooBarQuixService.convertNumber(51));
    }

    @Test
    public void convertNumber53ShouldReturnBarFoo() {
        assertEquals("BarFoo", fooBarQuixService.convertNumber(53));
    }

    @Test
    public void convertNumber33ShouldReturnFooFooFoo() {
        assertEquals("FooFooFoo", fooBarQuixService.convertNumber(33));
    }

    @Test
    public void convertNumber27ShouldReturnFooQuix() {
        assertEquals("FooQuix", fooBarQuixService.convertNumber(27));
    }

    @Test
    public void convertNumber15ShouldReturnFooBarBar() {
        assertEquals("FooBarBar", fooBarQuixService.convertNumber(15));
    }
}
