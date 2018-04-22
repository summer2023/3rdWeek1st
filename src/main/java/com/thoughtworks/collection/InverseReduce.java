package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {
    }

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        /*
        * 题目中是根据随机数生成的数来递减，不是写死的2
        *  Integer divide = this.random.nextInt(3);
        return IntStream.iterate(number-divide, item->item-divide).limit(number/divide).boxed().collect(Collectors.toList());
        * */
        List<Integer> result = new ArrayList<Integer>();
        for (int i = number - 2; i > 0; i = i - 2) {
            result.add(i);
        }
        return result;
    }
}
