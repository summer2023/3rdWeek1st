package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperator {

    public List<Integer> getListByInterval(int left, int right) {
        /*数组反转有很多办法：
        1.Collections.reverse(ArrayList) https://blog.csdn.net/guyuealian/article/details/51113133
        2.sorted排序给一个逆序
        */
        if (left <= right) {
            return IntStream.rangeClosed(left, right).boxed().collect(Collectors.toList());
        }
        List<Integer> list1 = IntStream.rangeClosed(right, left).boxed().collect(Collectors.toList());
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = list1.size() - 1; i >= 0; i--) {
            list2.add(list1.get(i));
        }
        return list2;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        /*
        * 还是数组反转的问题，参考上一题*/
        if (left <= right) {
            return IntStream.rangeClosed(left, right).boxed().filter(num -> num % 2 == 0).collect(Collectors.toList());
        }
        List<Integer> list1 = IntStream.rangeClosed(right, left).boxed().filter(num -> num % 2 == 0).collect(Collectors.toList());
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = list1.size() - 1; i >= 0; i--) {
            list2.add(list1.get(i));
        }
        return list2;
    }

    public List<Integer> popEvenElments(int[] array) {
        return IntStream.of(array).boxed().filter(num -> num % 2 == 0).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        /*
        * 问题想得复杂了，这道题直接用你原来的方式即可,但是代码可以重构成一行。
        * return array[array.length - 1];
        * */
        return IntStream.of(array).boxed().skip(array.length - 1).findFirst().get();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        /*
        * array 转 list不要用这么复杂的方式，可以直接用Arrays.asList()
        * */
        List<Integer> list2 = IntStream.of(secondArray).boxed().collect(Collectors.toList());
        return IntStream.of(firstArray).boxed().filter(t -> list2.contains(t)).collect(Collectors.toList());
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        /*简单的说，这道题就是求并集，这个做法也OK，但是注意array 转 list 简单一点。
        另外一种做法就是全部加进去后去重*/
        List<Integer> list1 = Stream.of(firstArray).collect(Collectors.toList());
        List<Integer> list2 = Stream.of(secondArray).collect(Collectors.toList());
        list1.addAll(Stream.of(secondArray).filter(t -> !list1.contains(t)).collect(Collectors.toList()));
        return list1;
    }
}
