package com.kata.foobarquix.controllers;

import com.kata.foobarquix.dto.ResultDTO;
import com.kata.foobarquix.services.FooBarQuixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo-bar-quix")
public class FooBarQuixController {
    private final FooBarQuixService fooBarQuixService;

    public FooBarQuixController(FooBarQuixService fooBarQuixService) {
        this.fooBarQuixService = fooBarQuixService;
    }

    @GetMapping("/{inputNumber}")
    public ResultDTO convertNumber(@PathVariable("inputNumber") int inputNumber) {
        return new ResultDTO(fooBarQuixService.convertNumber(inputNumber));
    }
}
