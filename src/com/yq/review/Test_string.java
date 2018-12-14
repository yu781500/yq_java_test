package com.yq.review;

import java.util.Scanner;

public class Test_string {
    public static void main(String[] args) {
//    构造方法
//        String str1 = new String(new byte[]{1, 2, 3});
//        System.out.println("字节数组转字符串  " + str1);
//        String str2 = new String(new byte[]{1, 4, 3, 3, 2, 2, 3}, 0, 3);
//        System.out.println("字节数组的一部分转为字符串  " + str2);
//        String str3 = new String(new char[]{'透', ' ', '你', '娘'});
//        System.out.println("字符数组转字符串  " + str3);
//        String str4 = new String(new char[]{'透', ' ', '你', '娘'}, 0, 2);
//        System.out.println("字符数组的一部分转为字符串  " + str4);
//        String str5 = new String("透你娘 ");
//        System.out.println(str5);

        login();

        String s = new String("你在哪里");
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
    }

    public static void login() {
        Scanner read;
        read = new Scanner(System.in);
        String username = null;
        String password = null;
        System.out.println("please enter login username!");
        username = read.nextLine();
        System.out.println("please enter login password");
        password = read.nextLine();

        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("login success");
        } else {
            for (int i = 3; i > 1; i--) {
                i--;
                System.out.println("login failure");
                System.out.println("you have " + i + " times chances");
                if (i == 1) {
                    System.out.println("please go away,loser!");
                }
            }
        }

    }

}
