package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(num->num*3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return array.stream().map(num->String.valueOf((char)(num+96))).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        List<String> result = new ArrayList<String>();
        for (Integer n : array) {
            StringBuffer sb=new StringBuffer();
            int quotient=n/26;
            int remainder=n%26;
            if(n>26) {
                sb=remainder==0?sb.append((char) (quotient + 95)).append((char) (26+ 96)):sb.append((char) (quotient + 96)).append((char) (remainder + 96));
            }else {
                sb.append((char) (remainder + 96));
            }
            result.add(sb.toString());
        }
        return result;
    }

    public List<Integer> sortFromBig() {
        List<Integer> list1 = array.stream().sorted().collect(Collectors.toList());
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i=list1.size()-1;i>=0; i--){
            list2.add(list1.get(i));
        }
        return list2;
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
    }
}
