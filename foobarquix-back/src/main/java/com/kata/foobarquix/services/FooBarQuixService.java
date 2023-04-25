package com.kata.foobarquix.services;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.getNumericValue;
import static java.util.stream.Collectors.joining;

@Service
public class FooBarQuixService {
    private final static Map<Integer, String> encodingDivisibles;
    private final static Map<Integer, String> encodingApparences;
    private final static String FOO = "Foo";
    private final static String BAR = "Bar";
    private final static String QUIX = "Quix";

    static {
        encodingDivisibles = new HashMap<>();
        encodingApparences = new HashMap<>();

        encodingDivisibles.put(3, FOO);
        encodingDivisibles.put(5, BAR);

        encodingApparences.put(3, FOO);
        encodingApparences.put(5, BAR);
        encodingApparences.put(7, QUIX);

    }

    public String convertNumber(int inputNumber) {
        StringBuilder sb = new StringBuilder();

        sb.append(encodingDivisibles.keySet().stream()
                .filter(toReplace -> inputNumber % toReplace == 0)
                .map(encodingDivisibles::get)
                .collect(joining()));

        final String inputAsString = String.valueOf(inputNumber);

        sb.append(inputAsString.chars()
                .mapToObj(integerAsChar -> encodingApparences.getOrDefault(getNumericValue(integerAsChar), ""))
                .collect(joining()));

        String result = sb.toString();
        return result.isEmpty()? inputAsString : result;
    }
}
