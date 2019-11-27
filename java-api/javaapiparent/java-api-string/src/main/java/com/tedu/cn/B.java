package com.tedu.cn;

public class B {
    public static void main(String[] args) {
        Person p=new Person("小明",18,22.5,88.7,'M');
        Person p1=new Person("小明",18,22.5,88.7,'W');
        System.out.println(p.equals(p1));
        System.out.println("____________");
        System.out.println(p==p1);
        System.out.println("____________");
        System.out.println(p1);

    }
}
