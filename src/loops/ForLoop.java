package loops;

import java.util.Arrays;

public class ForLoop {
    public static void main(String[] args) {
        String[] names = {"samuel", "david", "paul", "eugene", "cynthia"};
        
        // iterating through an array forwards
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // iterating through an array backwards
        for(int i = names.length -1 ; i >=0; i--) {
            System.out.println(names[i]);
            continue;
        }

        int myNumber = 5;

        System.out.println(myNumber++);
        System.out.println(++myNumber);

        // using enhanced for loops in java
        for(String name : names) {
            System.out.println("Using enhanced for loops...");
            System.out.println(name);
            break;
        }
        Arrays.stream(names).forEach(name -> System.out.println(name));
        usingTheWhileLoop();
        usingTheDoWhileLoop();
    }

    public static void usingTheWhileLoop() {
        int count = 0;
        while (count < 5) {
            count ++;
            System.out.println("Hi");
        }
    }

    public static void usingTheDoWhileLoop() {
        int count = 0;

        do {
            System.out.println("This will work atleast once");
            count++;
        } while (count < 0);
    }
}
