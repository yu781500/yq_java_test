package com.yq.review;

public class Test_string2 {
    public static void main(String[] args) {
//        countString();
//        reversal();
        compareTo();
    }

    public static void countString() {
        String s = new String("aAVvcwcweFefeiF&*(#)@(123123");
        char[] c = s.toCharArray();
        int xzimu = 0, dzimu = 0, shuzi = 0, fuhao = 0;

        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
            if (c[i] >= 'a' && c[i] <= 'z') {
                xzimu++;
            } else if (c[i] >= 'A' && c[i] <='Z') {
                dzimu++;
            } else if (c[i] >= '0' && c[i] <= '9') {
                shuzi++;
            } else {
                fuhao++;
            }
        }
        System.out.println("小写字母字符出现的次数为：" + xzimu);
        System.out.println("大写字母字符出现的次数为：" + dzimu);
        System.out.println("数字字母字符出现的次数为：" + shuzi);
        System.out.println("其他字母字符出现的次数为：" + fuhao);

    }

    public static void reversal() {
        String s = "abcd";
        char[] c = s.toCharArray();
        System.out.println(c);
        for (int i = 0; i < c.length/2; i++) {
            c[i] = (char) (c[i] ^ c[c.length - i - 1]);
            c[c.length - i - 1] = (char) (c[i] ^ c[c.length - i - 1]);
            c[i] = (char) (c[i] ^ c[c.length - i - 1]);
        }
        System.out.println(c);

        String t = String.valueOf(c);
        System.out.println(t);
    }

    public static void compareTo() {
        String a = "abc";
        String b = "abc";
        String a1 = new String("abc");
        String b1 = new String("abc");
        System.out.println(a == b);
        System.out.println(a == a1);
        System.out.println(a1 == b1);
        System.out.println( a.equals(b));
        System.out.println(a.equals(a1));
        System.out.println(a1.equals(b1));
    }
}
