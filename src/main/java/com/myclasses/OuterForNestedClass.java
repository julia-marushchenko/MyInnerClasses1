package com.myclasses;

/**
 * OuterForNestedClass class.
 */
public class OuterForNestedClass {

    // Constructor.
    public OuterForNestedClass() {
        System.out.println("OuterForNestedClass class");
    }

    /**
     * NestedClass class.
     */
    static class NestedClass {

        // Constructor.
        public NestedClass() {
            System.out.println("NestedClass class");
        }

    }
}
