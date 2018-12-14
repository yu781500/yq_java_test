package com.yq.foundation;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.Scanner;

public class Test_judgement {
    public static void main(String[] args) {
        //  test_Integer();
//        test_String();
        test_leapYear();


    }

    /**
     * 基本数据类型和包装类比较，== 和equals 都是相同的
     */
    public static void test_Integer() {
        int a = 1;
        Integer in = new Integer("1");
        if (in.equals(a)) {
            System.out.println("the same");
        } else
            System.out.println("the difference");
    }

    public static void test_String() {
        //java判断以及关系运算
        String str1 = "yqzhenshuai";
        String str2 = new String("zrhaokan");
        if (str1.equals(str2)) {
            System.out.println("true");

        } else
            System.out.println("flase");
    }

    public static void test_Swtich(int mon) {
//        Scanner read = new Scanner(System.in);
//        System.out.println("判断月份是大月还是小月，请输入你想判断的月份");
//        int mon = read.nextInt();
        switch (mon) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("您输入的月份为大月，有31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("您输入的月份为小月，30天");
                break;
            default:
                System.out.println("Please enter the correct month");
        }
    }

    /**
     * 输入年份及月份，判断这个月有几天，正则表达式控制输入的格式匹配
     */
    public static void test_leapYear() {
        while (true) {
            Scanner read = new Scanner(System.in);
            System.out.println("请输入您想查看的年份及月份，格式如下：\n1997.3,请输入：");
            String ym = read.nextLine();
            String[] lyear = ym.split("\\.");
            int y = 0, m = 0;
            System.out.println();
            y = Integer.parseInt(lyear[0]);
            m = Integer.parseInt(lyear[1]);
//            System.out.println(y + "  " + m);
            if (lyear[0].matches("\\d\\d\\d\\d") && lyear[1].matches("[0-1]\\d")) {
                if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
                    if (m == 2) {
                        System.out.println("这一年是闰年，2月有29天");
                    } else {
                        System.out.print("这一年是润年，");
                        test_Swtich(m);
                    }
                } else {
                    if (m == 2) {
                        System.out.println("这一年是平年，2月有28天");
                    } else {
                        System.out.print("这一年是平年，");
                        test_Swtich(m);
                    }
                }
            } else {
                System.out.println("请输入正确的年月！");
            }
        }
    }
}



