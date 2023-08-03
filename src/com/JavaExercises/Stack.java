package com.JavaExercises;

import java.util.Arrays;

public class Stack {
    public int[] stack;
    public int top;
    public static final int DEFAULT_CAPACITY=4;
    public Stack(){
        stack=new int[DEFAULT_CAPACITY];
        top=0;
    }
    public Stack(int size){
        stack = new int[size];
    }

    /*public boolean isFull(){
        if (top == stack.length){
            return true;
        }
        return false;
    }*/
    public boolean isEmpty(){
        if(top==0)
            return true;
        return false;
    }
    public void push(int item){
        ensurCapacity();
        stack[top] = item;
        top++;
        System.out.println("item added!");
    }
    public int pop(){
        int popItem;
        if(!isEmpty()) {
            popItem=stack[top-1];
            top--;
            return popItem;
        }
        System.out.println("Stack is empty!");
        return -1;
    }
    public int peek(){
        if (isEmpty())
            throw new IllegalArgumentException("Stack is empty!");
        return stack[top-1];
    }
    private void ensurCapacity() {
        if (top == stack.length) {
            int newCapacity=top*2;
            stack= Arrays.copyOf(stack,newCapacity);
        }
    }
    public int size(){
        return top;
    }
    public static void main(String[] args) {
        Stack stack =new Stack();
        stack.push(3);
        stack.push(4);
        stack.push(9);
        stack.push(19);
        stack.push(1);
        //System.out.println(stack.isEmpty());
        System.out.println("Pop: "+stack.pop());
        System.out.println("Peek: "+stack.peek());
        System.out.println("Size is: "+stack.size());

    }

}

