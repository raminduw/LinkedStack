package com.ramindu.linked.stack;

public class Main {
	
	public static void main(String[] args) {
        System.out.println("*****LINKED STACK*****");
        
        LinkedStack stack = new LinkedStack();

        stack.push(new Employee(123, "Jane", "Jones"));
        stack.push(new Employee(345,"John", "Doe"));
        stack.push(new Employee(456,"Mary", "Smith"));
        stack.push(new Employee(678,"Mike", "Wilson"));
        stack.push(new Employee(789,"Bill", "End"));
        
        stack.printStack();
        
        System.out.println("Popped: " + stack.pop());
        stack.printStack();
        
        System.out.println("Peek: " + stack.peek());
        stack.printStack();

        
	}

}
