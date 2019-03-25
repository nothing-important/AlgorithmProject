package com.example.administrator.algorithmproject;

/**
 * 菲波那切数列
 * 输入n，求出菲波那切数列第n项的值
 *
 * 菲波那切数列定义式：
 * F0 = 0;
 * F1 = 1;
 * Fn = Fn-1 + Fn-2
 */
public class Algorithm4 {

    public static long getFibonacci(int n){
        if (n <= 0){
            return 0;
        }
        if (n == 1 || n == 2){
            return 1;
        }
        //第n-2个Fibonacci数的值
        long prePre = 1;
        //第n-1个Fibonacci数的值
        long pre = 1;
        //第n个Fibonacci数的值
        long current = 1;
        //求第n个Fibonacci数的值
        for (int i = 3 ; i <= n ; i ++){
            current = prePre + pre;//第n项值为前两项之和
            prePre = pre;//第n-2个数值变为第n-1个
            pre = current;//第n-1个数值变为当前的数值
        }
        return current;
    }

}
