package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Flaten {

    int[][] array;
    //Integer[][] array;
    public Flaten(int[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        int[] change = Arrays.stream(array).flatMapToInt(num -> Arrays.stream(num)).toArray();
        return IntStream.of(change).boxed().collect(Collectors.toList());
        //return Arrays.stream(array).mapToInt(Integer::valueOf).flatMapToInt(num -> Arrays.stream(num)).collect(Collectors.toList());  vauleOf标红？
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        int[] change = Arrays.stream(array).flatMapToInt(num -> Arrays.stream(num)).toArray();
        return IntStream.of(change).boxed().distinct().collect(Collectors.toList());
    }
}
