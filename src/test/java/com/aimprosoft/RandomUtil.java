package com.aimprosoft;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomUtil {

    public static String generateEmail(String domain, int length) {
        return RandomStringUtils.random(length, "abcdefghijklmnopqrstuvwxyz") + "@" + domain;
    }
}
