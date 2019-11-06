package com.shinyke;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReTest {
    public static void main(String[] args) throws  Exception{
        String str = "今年的营业额为112347915.5465万元";
        Pattern p = Pattern.compile("(?<=\\d)(?<!\\.\\d{1,20})(?=(\\d{3})+(?!\\d))");
        Matcher matcher = p.matcher(str);
        String s = matcher.replaceAll(",");
        System.out.println(s);


        Pattern p2 = Pattern.compile("((?:Jeffery)Jeff)");
        Matcher matcher2 = p2.matcher("by Jeffery Friend");
        if(matcher2.find()){
            System.out.println(matcher2.group(1));
        }
    }
}
