package com.sdet.java.basics;

/**
 * Day 2: Java Method Call Stack
 *
 * Method Call Stack:
 * - Each thread has its own call stack
 * - Stores method calls and local variables
 * - Follows LIFO (Last In First Out) principle
 *
 * Method Call Process:
 * 1. When a method is called, a new stack frame is created and pushed onto the stack.
 * 2. The stack frame contains method parameters, local variables, and return address.
 * 3. When the method execution is complete, the stack frame is popped off the stack.
 * 4. Control returns to the calling method using the return address.
 *
 * Example:
 * - main() calls firstMethod()
 * - firstMethod() calls secondMethod()
 * - secondMethod() completes and returns to firstMethod()
 * - firstMethod() completes and returns to main()
 * 
 * Note: Sometime it may be confusing to see print statement order in form of FIFO 
 *       but method calls and returns always follow LIFO. Focus on method entry and exit.
 */
public class MethodCallStack {
    public static void main(String[] args) {
        System.out.println("Demonstrating Method Call Stack in Java:");
        firstMethod();
    }

    private static void firstMethod() {
        System.out.println("Inside firstMethod");
        secondMethod();
        System.out.println("Exiting firstMethod");
    }

    private static void secondMethod() {
        System.out.println("Inside secondMethod");
    } 

}
