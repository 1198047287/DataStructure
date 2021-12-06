package com.baize.二叉搜索树_06;

public class BinarySearchTree<E> {
    private int size;
    private Node<E> root;

    public int size(){
        return size;
    }

    public void add(E element){
        elementNotNullCheck(element);
        // 如果没有根节点。 第一个就是
        if (root==null){
            root = new Node<>(element,null);
            size ++;
            return;
        }

        //1.添加的不是第一个节点
        Node<E> node = this.root;
        //2.父节点
        Node<E> parent = null;
        //3.加入左节点还说右节点 用compare判断
        int compare = 0;
        while (node!=null){
            compare = compare(element,node.element);
            // 注意自节点的父节点在这。  向左/向右的上一个节点
            parent = node;
            if (compare>0){
                node = node.right;
            }else if (compare<0){
                node = node.left;
            }else {
                return;
            }
        }
        // 加入
        if (compare>0){
            parent.right = new Node<>(element,parent);
        }else if (compare<0){
            parent.left = new Node<>(element,parent);
        }
        size++;
    }

    public boolean isEmpty(){
        return false;
    }

    public void clear(){

    }

    public void remove(){

    }

    /**
     * @return  返回值等于0代表 e1=e2,大于0 e1>e2  小于0  e1<e2
     */
    private int compare(E e1,E e2){
        return 0;
    }


    private void elementNotNullCheck(E element){
        if (element==null){
            throw new IllegalArgumentException("element must not be null");
        }
    }

    private class Node<E>{
        E element;
        Node<E> parent;
        Node<E> left;
        Node<E> right;

        //节点都要保存父节点
        public Node(E element,Node<E> parent){
            this.element = element;
            this.parent = parent;
        }
    }


}
