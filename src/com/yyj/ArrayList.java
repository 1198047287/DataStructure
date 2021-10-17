package com.yyj;

import org.omg.CORBA.Object;

import java.util.Arrays;

/**
 * 动态数组
 */
public class ArrayList<E> {
    // 保存的元素
    public E[] elements;
    // 元素的数量
    public int size;

    public static final int DEAFUAL_SIZE = 10;
    public static final int ELEMENT_NOT_FOUND = -1;

    public ArrayList(){
        this.elements = (E[]) new Object[DEAFUAL_SIZE];
    }

    /**
     * 有参构造器ð
     * @param capaticy
     */
    public ArrayList(int capaticy){
        this.elements = (E[]) new Object[capaticy];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean contanis(int element) {
        return indexOf(element)!=ELEMENT_NOT_FOUND;
    }


    public void add(E element) {

        ensureCapacity(size+1);

        elements[size] = element;
        size++;
    }

    /**
     * 扩容算法
     * @param capacity
     */
    private void ensureCapacity(int capacity) {
        int oldCapacity = elements.length;
        if (capacity<oldCapacity)return;

        int newCapacity = (int) (oldCapacity*1.5);
        E[] newElements = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        this.elements = newElements;
        System.out.println(oldCapacity+"_扩容为_"+newCapacity);
    }

    public E get(int index){
        if (size==0||index>=size){
            throw new IndexOutOfBoundsException("size: "+size+" index: "+index);
        }
        return elements[index];
    }

    public E set(int index,E element) {
        // 注意  思想  size即为我们自己控制的
        if (size==0||index>=size){
            throw new IndexOutOfBoundsException("size: "+size+" index: "+index);
        }
        E old = elements[index];
        elements[index] = element;
        return old;
    }

    /**
     * 从该位置开始往后挪  .
     *
     * 前边思路错误。 改： 1。 要从最后一位开始挪动。   2。注意for循环条件  >=  而不是<
     *
     * @param index
     * @param element
     */
    public void add(int index,int element){
        for (int i = size-1; i >= index; i--) {
            elements[i+1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    // 删除索引位置的元素  后边的元素往前挪
    public int remove(int index){
        if (size==0||index>=size){
            throw new IndexOutOfBoundsException("size: "+size+" index: "+index);
        }
        int element = elements[index];
        for (int i = index; i <= size; i++) {
            elements[i] = elements[i+1];
        }
        size--;
        return element;
    }

    public int indexOf(int element){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i]==element){
                return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    public void clear(){
        // 注意 思想。  不用每次都把元素删除。  后边进行覆盖即可。
         this.size = 0;
    };

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(elements[i]);
            if (i!=size-1){
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
