package com.yq.review;

import java.util.*;

public class Test_collection {
    public static void main(String[] args) {
//        Collection c = new ArrayList();
//        ((ArrayList) c).add(1);
//        Collection c2 = new ArrayList();
//        ((ArrayList) c2).add(2);
//        boolean b = ((ArrayList) c).addAll(1, c2);
//        System.out.println(b);
//        Iterator it = c.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//
//        }

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        System.out.println(list);
        Iterator it = list.iterator();
        List list1 = null;
        list1 = new ArrayList();
        System.out.println(list1);
        while (it.hasNext()) {
            if (list1.contains(it.next())) {
                System.out.println("It already has elements");
                it.remove();
            } else {
                list1.add(it.next());
            }
            System.out.println(list1);

        }


    }

    public static void test_set() {
        TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return 0;
            }
        });


    }
}
