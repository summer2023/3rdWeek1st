package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public boolean isEven(int num){
        boolean flag=false;
        if (num % 2 == 0) {
            flag=true;
        }
        return flag;
    }

    public int getMaximum() {
        int result = 0;
        int max = 0;
        for (Integer n : arrayList) {
            if(n>max){
                max=n;
            }
        }
        //throw new NotImplementedException();
        result = max;
        return result;
    }

    public double getMinimum() {
        int result = 0;
        int min = arrayList.get(0);
        for (Integer n : arrayList) {
            if(n<min){
                min=n;
            }
        }
        result = min;
        return result;
        //throw new NotImplementedException();
    }

    public double getAverage() {
        double result=0.0;
        int sum=0;
        for (Integer n : arrayList) {
            sum=sum+n;
        }
        result=sum/(double)arrayList.size();
        //throw new NotImplementedException();
        return result;
    }

    public double getOrderedMedian() {
        double result = 0.0;
        int flag=0;
        if (isEven(arrayList.size())) {
            flag = arrayList.size() / 2;
            result = ((arrayList.get(flag - 1) + arrayList.get(flag)) / (double)2);
        }else{
            flag = arrayList.size() / 2;
            result = (double) (arrayList.get(flag));
        }
        //throw new NotImplementedException();
        return result;
    }

    //实现接口SingleLink，然后再此函数内使用
    /*public Double getMedianInLinkList(SingleLink singleLink) {
        Double result=0.0;
        int flag=0;
        if (isEven(arrayList.size())) {
            flag = arrayList.size() / 2;
            //result = ((singleList.getNode(flag) + singleList.getNode(flag + 1)) / (double) 2);
        }else{
            flag = arrayList.size() / 2;
            result = (double) (singleList.getNode(flag+1));
        }
        return result;
    }*/

    public int getFirstEven() {
        int result=0;
        for (Integer n : arrayList) {
            if (isEven(n)) {
                result=n;
                break;
            }
        }

        //throw new NotImplementedException();
        return result;
    }

    public int getIndexOfFirstEven() {
        int result = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (isEven(arrayList.get(i))) {
                result=i;
                break;
            }
        }
        //throw new NotImplementedException();
        return result;
    }

    public int getLastOdd() {
        int result = 0;
        for (int i = arrayList.size()-1; i >=0; i--) {
            if (!isEven(arrayList.get(i))) {
                result = arrayList.get(i);
                break;
            }
        }
        //throw new NotImplementedException();
        return result;
    }

    public int getIndexOfLastOdd() {
        int result = 0;
        for (int i = arrayList.size()-1; i >=0; i--) {
            if (!isEven(arrayList.get(i))) {
                result = i;
                break;
            }
        }
        //throw new NotImplementedException();
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
        //throw new NotImplementedException();
        return result;
    }


}
