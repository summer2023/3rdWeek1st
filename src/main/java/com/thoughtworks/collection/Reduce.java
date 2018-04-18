package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream().mapToInt(Integer::valueOf).sorted().skip(arrayList.size()-1).findFirst().getAsInt();
    }

    public double getMinimum() {
        return arrayList.stream().mapToInt(Integer::valueOf).sorted().findFirst().getAsInt();
    }

    public double getAverage() {
        return arrayList.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }

    public double getOrderedMedian() {
        List<Integer> list=arrayList.stream().sorted().collect(Collectors.toList());
        return list.size()%2==0?list.stream().skip(list.size()/2-1).limit(2).mapToDouble(num->num).average().getAsDouble():
                list.stream().skip(list.size()/2).mapToDouble(num->num).findFirst().getAsDouble();
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        Double result=0.0;
        int flag=0;
        singleLink = new SingleList(arrayList);
        if (arrayList.size()%2==0) {
            flag = arrayList.size() / 2;
            result = (Integer.parseInt(singleLink.getNode(flag).toString())+ Integer.parseInt(singleLink.getNode(flag + 1).toString())) / (double) 2;
        }else{
            flag = arrayList.size() / 2;
            result = (double) (singleLink.getNode(flag+1));
        }
        return result;
    }

    public int getFirstEven() {
       return arrayList.stream().mapToInt(Integer::intValue).filter(num->num%2==0).findFirst().getAsInt();
    }

    public int getIndexOfFirstEven() {
        int result = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2==0) {
                result=i;
                break;
            }
        }
        return result;
    }

    public int getLastOdd() {
        List<Integer> list=arrayList.stream().filter(num->num%2!=0).collect(Collectors.toList());
        return list.stream().mapToInt(Integer::intValue).skip(list.size()-1).findFirst().getAsInt();
    }

    public int getIndexOfLastOdd() {
        int result = 0;
        for (int i = arrayList.size()-1; i >=0; i--) {
            if (arrayList.get(i)%2!=0) {
                result = i;
                break;
            }
        }
        return result;
    }

    public boolean isEqual(List<Integer> arrayList1) {
        boolean result = true;
        if(arrayList.size()!=arrayList1.size()){
            result=false;
        }else {
            for (int i = 0; i < arrayList.size()-1; i++) {
                if (arrayList.get(i) != arrayList1.get(i)) {
                    result=false;
                    break;
                }
            }
        }
        return result;
    }


}
