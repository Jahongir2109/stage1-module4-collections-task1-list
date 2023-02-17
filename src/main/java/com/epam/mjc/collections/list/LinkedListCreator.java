package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        if(sourceList.size()>0&& sourceList.get(0)%2!=0){
            for (int i = sourceList.size()-1; i >= 0; i--) {
                if (sourceList.get(i)%2!=0){
                    linkedList.add(sourceList.get(i));
                }
            }
        }
            for (int i=0;i<sourceList.size();i++){
                if (sourceList.get(i)%2==0){
                    linkedList.addLast(sourceList.get(i));
                }
            }
        return linkedList;
    }
}
