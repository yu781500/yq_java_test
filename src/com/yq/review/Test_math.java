package com.yq.review;

import java.util.Random;

/**
 * abs(int a) 绝对值
 * ceil(double a)  向上取整，保留小数点后一位
 * max(int a, int b) min()  两个数的最大最小
 * pow(double a, double b)  a的b次方 平方
 * random() 1一下的随机数
 * round() 四舍五入
 * sqrt() 开方
 */
public class Test_math {
    public static void main(String[] args) {
        int a = -9;
        int abs = Math.abs(a);
        System.out.println(abs);
        double b = 2.0;
        System.out.println(Math.ceil(b));
        double c = 4.0;
        System.out.println(Math.pow(b, c));
        double v = Math.random();
        System.out.println(v);
        System.out.println(Math.sqrt(c));

        Random r = new Random();
        int i = r.nextInt(10) + 1;
        boolean b1 = r.nextBoolean();
        System.out.println(b1);
        System.out.println(i);
    }
}
