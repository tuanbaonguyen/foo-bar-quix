package com.kata.foobarquix.services;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

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
        encodingDivisibles.forEach((k,v) -> {
            if (inputNumber % k == 0) {
                sb.append(v);
            }
        });

        final String inputAsString = String.valueOf(inputNumber);

        for (int i = 0; i < inputAsString.length(); i++) {

            final char digit = inputAsString.charAt(i);

            final String digitAsString = String.valueOf(digit);

            final Integer key = Integer.valueOf(digitAsString);

            if (encodingApparences.containsKey(key)) {
                sb.append(encodingApparences.get(key));
            }
        }

        if (StringUtils.isEmpty(sb.toString()))
            return String.valueOf(inputNumber);

        return sb.toString();
    }
}
