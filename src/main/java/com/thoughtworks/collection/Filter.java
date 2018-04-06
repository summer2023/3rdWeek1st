package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public boolean isEven(int n){
        boolean flag=false;
        if (n % 2 == 0) {
            flag=true;
        }
        return flag;
    }

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer n : array) {
            if (isEven(n)) {
                result.add(n);
            }
        }
        return result;
        //throw new NotImplementedException();
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer n : array) {
            if(n%3==0){
                result.add(n);
            }
        }
        return result;
        //throw new NotImplementedException();
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer n : firstList) {
            for (Integer m : secondList) {
                if(n==m){
                    result.add(n);
                }
            }
        }
        return result;
        //throw new NotImplementedException();
    }

    public List<Integer> getDifferentElements() {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer n : array) {
            if(!result.contains(n)){
                result.add(n);
            }
        }
        return result;
        //throw new NotImplementedException();
    }
}