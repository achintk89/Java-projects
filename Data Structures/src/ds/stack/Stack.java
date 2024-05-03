package ds.stack;

import java.util.ArrayList;

public class Stack <T>{

    private int maxSize;
    private ArrayList<T> stackArray;
    private int top;

    public Stack(int maxSize){
        this.maxSize=maxSize;
        stackArray = new ArrayList<>();
        top = -1;
    }

    public T push(T data){
        if(isFull()){
            throw new RuntimeException("Stack is already full");
        }
        top++;
        stackArray.add(data);
        return data;
    }

    public T pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is already empty");
        }
        T data = stackArray.getLast();
        stackArray.remove(top);
        top--;
        return data;
    }

    public T peek(){
        return stackArray.getLast();
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==(maxSize-1);
    }

}