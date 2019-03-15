package com.example.administrator.algorithmproject;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Algorithm1 {

    public static boolean isContain(int [][] array , int findVal){
        //方法执行基础条件
        if (array == null || array.length < 1 || array[0].length < 1){
            return false;
        }
        int rows = array.length;//二维数组行数
        int cols = array[0].length;//二位数组列数
        int currentRow = 0;//起始行数
        int currentCol = cols - 1;//起始列数
        while (currentRow >= 0 && currentRow < rows && currentCol >= 0 && currentCol < cols){
            if (array[currentRow][currentCol] == findVal){
                return true;
            }else if (array[currentRow][currentCol] > findVal){
                currentCol--;
            }else {
                currentRow ++;
            }
        }
        return false;
    }

}
