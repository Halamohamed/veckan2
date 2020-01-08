package org.hala.collection_demo;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        String[] strings = {"Hala","Erik","Sima"};
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList);
        arrayList.add("Hala");
        System.out.println(arrayList);
        System.out.println(arrayList.contains("Hala"));
        System.out.println(arrayList.indexOf("Hala"));
        String hala = arrayList.get(0);
        System.out.println(hala);
        System.out.println(stringArrayToList(strings));;
    }

    public static Collection<String> stringArrayToList(String[] array){
        Set<String> arrayList = new HashSet<>();
        for( String s: array){
            arrayList.add(s);
        }
        return arrayList;
    }
}
