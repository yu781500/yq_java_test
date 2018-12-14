package com.yq.foundation;

/**
 * 测试append
 * reverse
 * delete
 * insert
 * replace
 */
public class Test_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("透你娘");
        System.out.println(sb);
        System.out.println(sb.append("了真"));
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        System.out.println(sb.replace(0, 1, "干"));
        System.out.println(sb.insert(0, "臭臭"));
        System.out.println(sb.append("张臭臭"));

        /**
         *
         * IO流
         * 异常
         * 线程池  jmm jvm
         * 网络编程用不到
         *
         *
         */
    }
}
