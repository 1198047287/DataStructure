package com.baize.动态数组_01;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(99);
        list.add(88);
        // ð
        list.add(1,55);
        System.out.println(list.toString());
        System.out.println(list.size);
        //TODO
        // 思考： Person占用了8字节。   Cat占用了12字节。
        // 所以： 对象数组，保存的是地址值。 而不是真实对象。
        // 否则会不知道分配多少内存空间
        Object[] objects = new Object[10];
        objects[0] = new Person();
        objects[1] = new Cat();



    }
}
