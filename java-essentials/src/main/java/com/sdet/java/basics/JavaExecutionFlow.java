package com.sdet.java.basics;

/**
 * Day 1: Java Execution Flow
 *
 * Why main() looks like this:
 * - public  : JVM must access it
 * - static  : JVM does not create object of the class
 * - void    : JVM does not expect any return value
 * - String[] args : Used for command-line arguments
 *
 * Execution Flow:
 * - JDK compiles source code into bytecode
 * - ClassLoader loads bytecode into JVM
 * - JVM searches for main() method
 * - Execution starts line by line
 *
 * Memory:
 * - Stack : method calls and local variables
 * - Heap  : objects (no user-defined objects in this program)
 */
public class JavaExecutionFlow {

    public static void main(String[] args) {
        System.out.println("ClassLoader loads bytecode into JVM memory.");
        System.out.println("JVM finds main method and starts execution.");
    }
}
