package org.ansel.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFindPunctuation {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\p{Punct}");

        Matcher m = p.matcher("One day! when I was walking. I found your pants? just kidding...");

    }
}
