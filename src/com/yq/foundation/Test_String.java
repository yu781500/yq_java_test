package com.yq.foundation;

/**
 * 用到 concat
 * subString
 * charAt
 * compareTo 参数为object 参数为String    compareToIgnoreCase
 * endWith
 * equals equalsIgnoreCase
 * indexOf  lastIndexOf
 *trim
 */
public class Test_String {
    public static void main(String[] args) {
        concat_string();
    }

    public static void concat_string() {
        String str1 = "yqzhenshuai";
        String str2 = new String("zrzhenhaokan");
        String str3 = "  yq z r  ";
        int a = 1;
        System.out.println("concat 拼接字符串"  + str1.concat(str2));
        System.out.println(str3 + "trim 忽略前导空白和尾部空白" + str3.trim());
        System.out.println("substring 分割出字串" + str1.substring(0, 1));
        System.out.println("compareTo 比较字符串" + str1.compareTo(str2));

    }

}
