/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Umar Malik
 */
public class StackUsingLinkedList {
    public class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
}

    private Node top;

        StackUsingLinkedList(){
            this.top = null;
        }
        
        
        public void push(int data){
     
            Node newNode = new Node(data);
            newNode.next =  top;
            top = newNode;
            }
    
        public void pop(){
            if(top == null){
                System.out.println("list is already Empty");
            }
            top = top.next;
        }
        
        public void display(){
            
            if(top == null){
                System.out.println("list is Empty");
            }
            else{
                Node current = top;
                while(current != null){
                    System.out.println(current.data);
                    current = current.next;
                }
            }
        }
        
        
        public void isEmpty(){
            if(top == null){
                System.out.println("List is Empty");
            }
            else{
                System.out.println("List is not Empty");
            }
        }
        
        public void peek(){
            if(top == null){
                System.out.println("List is Empty");
            }
            else{
                System.out.println(top.data);
            }
        }
        
    public static void main(String args[]) {
        
        StackUsingLinkedList stack = new StackUsingLinkedList();
        
        stack.push(5);
        stack.push(10);
        stack.push(20);
        stack.pop();
        stack.peek();
        stack.display();
    }

}
