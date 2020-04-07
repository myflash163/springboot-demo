package com.example.jol;

import org.openjdk.jol.info.ClassLayout;

/**
 * JOL 查看内存布局
 */
public class HelloJOL {
    public static void main(String[] args) {
        Object o = new Object();
        String s = ClassLayout.parseInstance(o).toPrintable();
        System.out.println(s);
        A a = new A();
        String as = ClassLayout.parseInstance(a).toPrintable();
        System.out.println(as);
    }

    private static class A {
    }
}
