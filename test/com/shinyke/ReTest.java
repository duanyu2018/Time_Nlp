package com.shinyke;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReTest {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\.((?<!\\d))([0-3][0-9]|[1-9])");
        Matcher matcher = p.matcher(".32");
        System.out.println(matcher.matches());
    }
}
