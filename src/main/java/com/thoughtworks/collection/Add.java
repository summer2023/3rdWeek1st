package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add {
    public boolean isEven(int num){
        boolean flag=false;
        if (num % 2 == 0) {
            flag=true;
        }
        return flag;
    }

    public boolean isOdds(int num) {
        boolean flag=false;
        if (num % 2 == 1) {
            flag=true;
        }
        return flag;
    }

    public int getSumOfEvens(int leftBorder, int rightBorder) {

        int lower = leftBorder > rightBorder ? rightBorder : leftBorder;
        int bigger = leftBorder < rightBorder ? rightBorder : leftBorder;
        int sum=0;
        for (int i = lower; i <=bigger ; i++) {
            if (isEven(i)) {
                sum=sum+i;
            }
        }
        return sum;
       // throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        //throw new NotImplementedException();
        int bigger = leftBorder > rightBorder ? leftBorder : rightBorder;
        int lower = leftBorder > rightBorder ? rightBorder : leftBorder;
        int sum = 0;
        for (int i = lower; i <=bigger ; i++) {
            if (isOdds(i)) {
                sum=sum+i;
            }
        }
        return sum;
    }


    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        //throw new NotImplementedException();
        int sum=0;
            for (Integer i:arrayList) {
                sum=(i*3+2)+sum;
            }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
//        throw new NotImplementedException();
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.size(); i++) {
            int n = arrayList.get(i);
            if (isOdds(n)) {
                result.add(n * 3 + 2);
            }else{
                result.add(n);
            }
        }
        return result;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        //throw new NotImplementedException();
        int sum=0;
        for (Integer n : arrayList) {
            if (isOdds(n)) {
                sum=(n*3+5)+sum;
            }
        }
        return sum;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList){
        //throw new NotImplementedException();
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i < arrayList.size(); i++) {
            int sum = arrayList.get(i - 1)+arrayList.get(i);
            result.add(sum * 3);
        }
        return result;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        //throw new NotImplementedException();
        double result=0.0;
        List<Integer> evens = new ArrayList<Integer>();
        for (Integer n:arrayList) {
            if (isEven(n)){
                evens.add(n);
            }
        }
        Collections.sort(evens);
        int flag=0;
        if (isEven(evens.size())) {
            flag = evens.size() / 2;
            result = (double) ((evens.get(flag - 1) + evens.get(flag)) / (double)2);
        }else{
            flag = evens.size() / 2;
            result = (double) (evens.get(flag));
        }
        return result;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        //throw new NotImplementedException();
        int sum=0;
        int count=0;
        double result=0.0;
        for (Integer n:arrayList) {
            if (isEven(n)){
                count++;
                sum=sum+n;
            }
        }
        result=sum/count;
        return result;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        //throw new NotImplementedException();
        boolean result = false;
        List<Integer> evens = new ArrayList<Integer>();
        for (Integer n:arrayList) {
            if (isEven(n)){
                evens.add(n);
            }
        }
        if (evens.contains(specialElment)) {
            result=true;
        }
        return result;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        //throw new NotImplementedException();
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> evens = new ArrayList<Integer>();
        for (Integer n:arrayList) {
            if (isEven(n)){
                evens.add(n);
            }
        }
        for (Integer n:evens) {
            if (!result.contains(n)) {
                result.add(n);
            }
        }
        return result;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        //throw new NotImplementedException();
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> evens = new ArrayList<Integer>();
        List<Integer> odds = new ArrayList<Integer>();
        for (Integer n:arrayList) {
            if (isEven(n)){
                evens.add(n);
            }else{
                odds.add(n);
            }
        }
        Collections.sort(evens);
        Collections.sort(odds);
        for (Integer n:evens) {
            result.add(n);
        }
        for (int i = odds.size()-1; i >=0 ; i--) {
            result.add(odds.get(i));
        }
        return result;
    }

}
