package com.JavaExercises;

import java.util.Arrays;

public class MyStack {
    private int[] stack;
    private int top;
    private int size;
    static final int DEFAULT_CAPACITY=4;
    private MyStack(){
        stack=new int[DEFAULT_CAPACITY];
        top=-1;
        size=0;
    }
    public void push(int item){
        ensurCapacity();
        top++;
        stack[top]=item;
        size++;
        System.out.println("item added!");
    }
    public int pop(){
        int item;
        if (!isEmpty()) {
            item=stack[top];
            top--;
            size--;
            return item;
        }

        //System.out.println("Stack is empty!");
        return -1;
    }
    public int peek(){
        return stack[top];
    }

    public boolean isEmpty() {
        if (top==-1)
            return true;
        return false;
    }

    private void ensurCapacity() {
        int newCapacity;
        if (top == stack.length-1) {
            newCapacity = top * 2;
            stack= Arrays.copyOf(stack,newCapacity);
        }
    }
    public int size(){
        return size;
    }
    public static void main(String[] args){
        MyStack stack=new MyStack();
        stack.push(10);
        stack.push(100);
        stack.push(200);
        stack.push(30);
        System.out.println(stack.pop());
        stack.push(35);
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }

}
