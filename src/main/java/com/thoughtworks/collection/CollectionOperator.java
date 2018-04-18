package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperator {

    public List<Integer> getListByInterval(int left, int right) {
        if(left<=right){return IntStream.rangeClosed(left, right).boxed().collect(Collectors.toList());}
        List<Integer> list1=IntStream.rangeClosed(right,left).boxed().collect(Collectors.toList());
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i=list1.size()-1;i>=0; i--){
            list2.add(list1.get(i));
        }
        return list2;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        if(left<=right){return IntStream.rangeClosed(left, right).boxed().filter(num->num%2==0).collect(Collectors.toList());}
        List<Integer> list1=IntStream.rangeClosed(right,left).boxed().filter(num->num%2==0).collect(Collectors.toList());
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i=list1.size()-1;i>=0; i--){
            list2.add(list1.get(i));
        }
        return list2;
    }

    public List<Integer> popEvenElments(int[] array) {
        return IntStream.of(array).boxed().filter(num->num%2==0).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return IntStream.of(array).boxed().skip(array.length-1).findFirst().get();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> list2 = IntStream.of(secondArray).boxed().collect(Collectors.toList());
       return IntStream.of(firstArray).boxed().filter(t->list2.contains(t)).collect(Collectors.toList());
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> list1 = Stream.of(firstArray).collect(Collectors.toList());
        List<Integer> list2=Stream.of(secondArray).collect(Collectors.toList());
        list1.addAll(Stream.of(secondArray).filter(t->!list1.contains(t)).collect(Collectors.toList()));
        return list1;
    }
}
