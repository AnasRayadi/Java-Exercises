package com.JavaExercises;

public class Queue {
    public int[] queue;
    public int rear;
    public int front;
    public int size;
    public static final int DEFAULT_SIZE=10;
    public Queue(){
        queue=new int[DEFAULT_SIZE];
        rear=-1;
        front=-1;
        size=0;
    }
    public static void main(String[] args){

    }
}
