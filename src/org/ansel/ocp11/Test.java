package org.ansel.ocp11;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Certification");
        List<StringBuilder> sbList = new ArrayList<>();
        sbList.add(new StringBuilder("Certification"));
        sbList.add(sb);
        sb.append("Guide!");
        sbList.add(sb);
        System.out.println(sbList);
    }
}