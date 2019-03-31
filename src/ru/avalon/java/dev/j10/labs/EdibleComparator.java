package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

public class EdibleComparator implements Comparator<String> {
    //Comparator
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
}
