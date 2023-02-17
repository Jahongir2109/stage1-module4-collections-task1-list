package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        List<Integer> numberList=new LinkedList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            numberList.add(Integer.valueOf(sourceList.get(i)));
        }

    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return Integer.valueOf(a);
    }
}
