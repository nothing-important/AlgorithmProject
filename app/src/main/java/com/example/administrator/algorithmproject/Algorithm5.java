package com.example.administrator.algorithmproject;

import java.util.List;

/**
 * 数字排序
 */
public class Algorithm5 {

    /**
     * 冒泡排序
     * 自认为是最简单的一个排序方法，只是拿出一个数，大的放后，小的放前就可以了
     * 时间复杂度为O(n2)
     */
    public static int [] sortOfBubble(int [] valueArray){

        int temp;
        for (int i = 0 ; i < valueArray.length ; i ++){
            for (int j = i + 1 ; j < valueArray.length ; j ++){
                if (valueArray[i] > valueArray[j]){//前面的数值大于后面的数值,交换位置
                    temp = valueArray[i];
                    valueArray[i] = valueArray[j];
                    valueArray[j] = temp;
                }
            }
        }
        return valueArray;
    }

    /**
     * 选择排序
     * 从数列中选择最小的数放在前面，然后再从剩余数中选择最小的放在前面，以此类推
     * 时间复杂度为O(n2)
     */
    public static int [] sortOfSelect(int [] valueArray){

        int temp;
        for (int i = 0 ; i < valueArray.length ; i ++){
            int k = i;
            for (int j = valueArray.length - 1 ; j > i ; j --){
                if (valueArray[j] < valueArray[k]){
                    k = j;
                }
            }
            temp = valueArray[i];
            valueArray[i] = valueArray[k];
            valueArray[k] = temp;
        }

        return valueArray;
    }

    /**
     * 插入排序
     * 从第一个元素开始，该元素被认为已经被排序，取出下一个元素，在已经排序的数列中
     * 从后向前扫描，如果该元素大于已排序元素最后以为，则将该元素插入至最后，如果该
     * 元素小于已排序元素，则将元素插入到前面，一直循环该步骤
     * 时间复杂度为O(n2)
     */
    public static int [] sortOfInsert(int [] valueArray){
        int temp;
        for (int i = 1 ; i < valueArray.length ; i ++){
            temp = valueArray[i];
            for (int j = i ; j > 0 && valueArray[j] < valueArray[j - 1] ; j --){
                valueArray[j] = temp;
            }
        }
        return valueArray;
    }

}
