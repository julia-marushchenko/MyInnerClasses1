package com.myclasses;

/**
 * OuterClass class.
 */
public class OuterClass {

    // Constructor.
    protected OuterClass() {
        System.out.println("Outer class.");
    }

    /**
     * Inner class.
     */
    public class InnerClass {

        // Constructor.
        protected InnerClass() {
            System.out.println("Inner class.");
        }

    }

    // JVM entry point.
    public static void main(String[] args) {

        // Creating instances of classes.
        // Outer class.
        OuterClass outerClass = new OuterClass();

        // Non-static inner class.
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        // Static instance.
        OuterForNestedClass.NestedClass nestedClass = new OuterForNestedClass.NestedClass();
    }
}