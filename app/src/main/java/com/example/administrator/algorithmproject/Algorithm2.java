package com.example.administrator.algorithmproject;


/**
 * 请实现一个函数，把字符串中的每个空格替换成"%20"，例如“We are happy.“，则输出”We%20are%20happy.“。
 */
public class Algorithm2 {

    public static String replaceInvildeStr(char[] arrayStr , int usedLength){
        String result = null;
        if (arrayStr == null || arrayStr.length < usedLength){
            return result;
        }
        //统计数组中空格数量
        int invildeNums = 0;
        for (int i = 0 ; i < usedLength ; i ++){
            if (arrayStr[i] == ' '){
                invildeNums ++;
            }
        }
        //计算转化后的字符长度为多少
        int targetLength = invildeNums * 2 + usedLength;
        //生成新数组，用来装载替换后的字符
        char [] resultArray = new char[targetLength];
        int currentPsn = 0;
        for (int i = 0 ; i < usedLength ; i ++){
            if (arrayStr[i] != ' '){
                resultArray[currentPsn] = arrayStr[i];
            }else {
                resultArray[currentPsn] = '%';
                currentPsn++;
                resultArray[currentPsn] = '2';
                currentPsn++;
                resultArray[currentPsn] = '3';
            }
            currentPsn++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char aResultArray : resultArray) {
            stringBuilder.append(aResultArray);
        }
        result = stringBuilder.toString();
        return result;
    }

}
