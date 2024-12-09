/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Umar Malik
 */
public class StackUsingArray {

    int maxSize;
    int[] stackArray;
    int top;
    
    StackUsingArray(int size){
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    //Check if the Stack is full
    public boolean isFull(){
        return (top == maxSize-1);
    }
    
    //Check if the Stack is Empty
    public boolean isEmpty(){
        return (top == -1);
    }
    
    
    // PUSH function
    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full cannot push" + data);
            return;
        }
        stackArray[++top] = data;
    }
    
    // POP function
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
         return stackArray[top--];
    }
    
    // POP function
    public void peek(){
        if(isEmpty()){
            System.out.println("List is Empty");
        }
        else{
            System.out.println("Peek element is " + stackArray[top]);
        }
    }
    
    public void display(){
        if(top == -1){
            System.out.println("List is Empty");
        }
        else{
            for(int i=0; i<maxSize; i++){
                System.out.println(stackArray[i]);
            }
            System.out.println("");
        }
    }
    
    public static void main(String args[]) {
       
        StackUsingArray stack = new StackUsingArray(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.peek();
        stack.display();
    }
}
