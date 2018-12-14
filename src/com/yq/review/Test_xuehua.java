package com.yq.review;

import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_xuehua {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tou");
        list.add("you");
        list.add("me");
        list.add("file");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
