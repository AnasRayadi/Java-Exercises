package com.JavaExercises;

public class Queue {
    protected int[] queue;
    protected int rear;
    protected int front;
    protected int size;
    public static final int DEFAULT_SIZE=10;
    public Queue(){
        queue=new int[DEFAULT_SIZE];
        front=-1;
        rear=-1;
        size=0;
    }
    public void push(int item){
        rear=(rear+1)% queue.length;
        queue[rear]=item;
        size++;
    }
    public int pop(){
        if (isEmpty()){
            throw new IllegalArgumentException("Queue is empty");
        }
        int item=queue[front];
        queue[front]= Integer.parseInt(null);
        front=(front+1)% queue.length;
        size--;
        return item;
    }

    public boolean isEmpty() {
        if (size==0)
            return true;
        return false;
    }
    public int size(){
        return size;
    }

    public static void main(String[] args){
        Queue queue=new Queue();
        queue.push(3);
        //queue.push(3);
        //queue.push(3);


    }
}
