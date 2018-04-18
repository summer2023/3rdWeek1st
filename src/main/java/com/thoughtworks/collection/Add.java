package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Add {

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int max = Math.max(leftBorder, rightBorder);
        int min = Math.min(leftBorder, rightBorder);
        return IntStream.rangeClosed(min, max).filter(num -> num % 2 == 0).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int max = Math.max(leftBorder, rightBorder);
        int min = Math.min(leftBorder, rightBorder);
        return IntStream.rangeClosed(min, max).filter(num -> num % 2 == 1).sum();
    }


    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
       return arrayList.stream().mapToInt(Integer::valueOf).map(num -> num * 3 + 2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(num->(num%2==1)?num*3+2:num).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(Integer::valueOf).filter(num -> num % 2 == 1).map(num -> num * 3 + 5).sum();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList){
        return IntStream.range(0, arrayList.size()).filter(i -> i < arrayList.size() - 1)
                .mapToObj(i -> (arrayList.get(i) + arrayList.get(i + 1)) * 3).collect(Collectors.toList());
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
       List<Integer> list=arrayList.stream().filter(num->num%2==0).sorted().collect(Collectors.toList());
       return list.size()%2==0?list.stream().skip(list.size()/2-1).limit(2).mapToDouble(num->num).average().getAsDouble():
               list.stream().skip(list.size()/2).mapToDouble(num->num).findFirst().getAsDouble();
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().mapToDouble(Integer::valueOf).filter(num->num%2==0).average().getAsDouble();

    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> list=arrayList.stream().filter(num->num%2==0).collect(Collectors.toList());
        if (list.contains(specialElment)) {
            return true;
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(num->num%2==0).distinct().collect(Collectors.toList());
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> list1=arrayList.stream().filter(num->num%2==0).sorted().collect(Collectors.toList());
        List<Integer> list2 = arrayList.stream().filter(num -> num % 2 != 0).sorted((i1, i2) -> i2 - i1).collect(Collectors.toList());
        list1.addAll(list2);
        return list1;
    }

}
