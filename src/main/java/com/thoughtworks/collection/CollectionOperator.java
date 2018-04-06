package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperator {
    public boolean isEven(int n){
        boolean flag = false;
        if (n % 2 == 0) {
            flag=true;
        }
        return flag;
    }
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        if(left<right){
            for(int i=left;i<=right;i++) {
                result.add(i);
            }
        }else{
            for(int i=left;i>=right;i--) {
                result.add(i);
            }
        }
        return result;
        //throw new NotImplementedException();
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        int flag=left<right?1:0;
        int start = isEven(left) ? left : (flag == 1 ? left + 1 : left - 1);
        List<Integer> result = new ArrayList<Integer>();
        if(left<right){
            for(int i=start;i<=right;i=i+2) {
                result.add(i);
            }
        }else{
            for(int i=start;i>=right;i=i-2) {
                result.add(i);
            }
        }
        return result;
        //throw new NotImplementedException();
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i : array) {
            if(isEven(i)){
                result.add(i);
            }
        }
        return result;
        //throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        int result;
        int len=array.length;
        result = array[len - 1];
        return result;
       // throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> result = new ArrayList<Integer>();
        for (int n : firstArray) {
            for (int num : secondArray) {
                if (n == num) {
                    result.add(n);
                }
            }
        }
        return result;
        //throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer n : firstArray) {
            result.add(n);
        }
        for (Integer m : secondArray) {
            if(!result.contains(m)){
                result.add(m);
            }
        }
        return result;
//        throw new NotImplementedException();
    }
}
