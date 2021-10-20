package com.baize.链表_02;


public class LinkedList<E> {

    // 元素数量
    private int size;
    // 首节点
    private Node<E> first;

    // node节点。 内部类
    private class Node<E>{
        // 保存的元素
        E elements;
        // 下一个节点
        Node<E> next;
        public Node(E elements, Node<E> next) {
            this.elements = elements;
            this.next = next;
        }
    }
    public void add(int index,E element){
        if (index==0){
            // 这里。 first为null，则下个元素为null，不为null，则下个元素是它本身
            first = new Node<>(element,first);
        }else {
            Node<E> pre = node(index - 1);
            // 注意这里；  pre.next其实就是没添加之前的next
            Node<E> node = new Node<>(element,pre.next);
            pre.next = node;
        }
        size++;
    }
    public void remove(int index){
        Node<E> prev = node(index - 1);
        prev.next = prev.next.next;
    }
    // 直接调用即可
    public E get(int index){
        return node(index).elements;
    }
    public E set(int index,E element){
        Node<E> node = node(index);
        E old = node.elements;
        node.elements = element;
        return old;
    }
    // 返回对应索引的元素
    private Node<E> node(int index){
        int i = 0;
        Node<E> node = first;
        while (i<index){
            node = node.next;
            i++;
        }
        return node;
    }
}
