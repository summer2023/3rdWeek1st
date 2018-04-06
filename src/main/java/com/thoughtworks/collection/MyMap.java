package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer n : array) {
            result.add(n*3);
        }
        //throw new NotImplementedException();
        return result;
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList<String>();
        for (Integer n : array) {
            result.add(String.valueOf((char)(n+96)));
        }
        //throw new NotImplementedException();
        return result;
    }

    public List<String> mapLetters() {
        List<String> result = new ArrayList<String>();
        for (Integer n : array) {
            StringBuffer sb=new StringBuffer();
            int quotient=n/26;
            int remainder=n%26;
            sb.append((char) (quotient + 96)).append((char) (remainder + 96));
            result.add(sb.toString());
        }
        //throw new NotImplementedException();
        return result;
    }

    public List<Integer> sortFromBig() {
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> tmp = new ArrayList<Integer>();
        for (Integer n : array) {
            tmp.add(n);
        }
        Collections.sort(tmp);
        for (int i = tmp.size()-1; i >=0 ; i--) {
            result.add(tmp.get(i));
        }
        //throw new NotImplementedException();
        return result;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer n : array) {
            result.add(n);
        }
        Collections.sort(result);
        //throw new NotImplementedException();
        return result;
        //throw new NotImplementedException();
    }
}
