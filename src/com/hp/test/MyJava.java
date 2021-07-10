package com.hp.test;

public class MyJava {
    public static void main(String[] args) {
        Danli li1=Danli.getInstance();
        Danli li2 = Danli.getInstance();
        System.out.println(li1==li2);
    }
}
