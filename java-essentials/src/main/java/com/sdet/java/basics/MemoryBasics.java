package com.sdet.java.basics;

/**
 * Day 2: Java Memory Basics
 *
 * Java Memory Areas:
 * - Heap Memory:
 *   - Stores objects and instance variables
 *   - Shared among all threads
 *   - Managed by Garbage Collector
 *
 * - Stack Memory:
 *   - Stores method calls and local variables
 *   - Each thread has its own stack
 *   - LIFO structure (Last In First Out)
 *
 * - Method Area:
 *   - Stores class-level data (class structures, static variables, constants)
 *   - Shared among all threads
 *
 * - Program Counter (PC) Register:
 *   - Keeps track of the current instruction being executed
 *   - Each thread has its own PC register
 *
 * Garbage Collection:
 * - Automatic memory management process
 * - Identifies and removes objects that are no longer referenced
 * - Helps prevent memory leaks and optimize memory usage
 */
public class MemoryBasics {
    public static void main(String[] args) {
        System.out.println("Java Memory Areas:");
        System.out.println("- Heap Memory: Stores objects and instance variables, shared among threads.");
        System.out.println("- Stack Memory: Stores method calls and local variables, each thread has its own stack.");
        System.out.println("- Method Area: Stores class-level data, shared among threads.");
        System.out.println("- Program Counter (PC) Register: Tracks current instruction, each thread has its own PC register.");
        System.out.println("Garbage Collection: Automatic memory management that removes unreferenced objects.");
        
        int number = 10;              // Primitive (Stack)
        double price = 99.99;         // Primitive (Stack)

        String name = "Durgesh";      // Reference in Stack, Object in Heap

        System.out.println(number);
        System.out.println(price);
        System.out.println(name);
    }
    
}
