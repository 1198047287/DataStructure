package com.yyj;

/**
 * 动态数组
 */
public class ArrayList {
    // 保存的元素
    public int[] elements;
    // 元素的数量
    public int size;

    public static final int DEAFUAL_SIZE = 10;
    public static final int ELEMENT_NOT_FOUND = -1;

    public ArrayList(){
        this.elements = new int[DEAFUAL_SIZE];
    }

    /**
     * 有参构造器
     * @param capaticy
     */
    public ArrayList(int capaticy){
        this.elements = new int[capaticy];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean contanis(int element) {
        return false;
    }


    public void add(int element) {

    }

    public int get(int index){
        if (size==0||index>size){
            throw new IndexOutOfBoundsException("size: "+size+" index: "+index);
        }
        return elements[index];
    }

    public int set(int index,int element) {
        // 注意  思想  size即为我们自己控制的
        if (size==0||index>size){
            throw new IndexOutOfBoundsException("size: "+size+" index: "+index);
        }
        int old = elements[index];
        elements[index] = element;
        return old;
    }

    public void add(int index,int element){

    }

}
