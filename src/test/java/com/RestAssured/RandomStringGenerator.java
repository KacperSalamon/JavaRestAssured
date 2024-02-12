package com.RestAssured;

import java.util.Random;

public class RandomStringGenerator {
    public static void main(String[] args) {
        int length = 257;
        String randomString = generateRandomString(length);
        System.out.println(randomString);
    }

    public static String generateRandomString(int length) {
        int leftLimit = 97; // kod ASCII dla litery 'a'
        int rightLimit = 122; // kod ASCII dla litery 'z'
        Random random = new Random();

        String randomString = random.ints(leftLimit, rightLimit + 1)
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return randomString;


    }
}
