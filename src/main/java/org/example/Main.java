package org.example;

import java.io.*;
import java.net.URI;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        MyFileReader myFileReader = new MyFileReader(
                "\\src\\main\\java\\org\\example","gem.xml");
        String strXml = myFileReader.readWithFileReader();

        String delimiter = "\\s*<[^<>]+>";                //  [^<>]+<\\/[^<>]+>";
        String[] str_arr = strXml.split(delimiter);
        for (String s1 : str_arr) {
            if (!s1.isEmpty()) System.out.println(s1);
        }
    }
}

// Pattern pattern = Pattern.compile("<.+>.+<\\/.+>");
//   Pattern pattern = Pattern.compile("\\s*<.+>.+<\\/.+>");
//  Pattern pattern = Pattern.compile(">.+<");
