package com.JavaExercises;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class WorkingWithStack {
    public static void main(String[] args){
        Stack<Integer> stack=new Stack();
        stack.push(2);
        stack.push(4);
        stack.push(6);
        //System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        //System.out.println(stack.size());
        System.out.println(stack.capacity());

    }
}
