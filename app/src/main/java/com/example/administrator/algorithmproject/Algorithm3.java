package com.example.administrator.algorithmproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个递增的数组，求和为s的两个数有多少对
 */
public class Algorithm3 {

    public static List<String> findResult(List<Integer> list, int sum){

        List<String> resultList = new ArrayList<>();

        if (list == null || list.size() < 2){
            return null;
        }

        int startCount = 0;

        while (startCount < list.size()){
            int anArray = list.get(startCount);
            for (int j = list.size() - 1; j >= startCount ; j--) {
                if (anArray + list.get(j) < sum) {//一个数加上数组中最大的数仍然小于所求，则所有都不满足
                    break;
                } else {
                    if (anArray + list.get(j) == sum) {
                        resultList.add(anArray+"---"+list.get(j));
                    }
                }
            }
            startCount++;
        }

        return resultList;
    }

}
