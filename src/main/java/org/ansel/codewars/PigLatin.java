package org.ansel.codewars;

public class PigLatin {

    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }

    public static String pigIt2(String str) {
        // Write code here
        String[] strArray = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : strArray) {
            if (s.trim().length() != 0) {
                s = lt(s);
            }
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }

    private static String lt(String s) {
        String first = s.substring(0, 1);
        String rest = s.substring(1);
        return rest + first + "ay";
    }
}
