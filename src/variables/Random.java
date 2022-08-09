package variables;

import java.time.LocalDate;
import java.util.Date;

/*
 * A random collections of things learnt 
 * on java variablres
 */
public class Random {
    public static void main(String[] args) {
        String userName = "kosicodes";
        Integer favoriteNumber = 7;
        Date date = new Date();

        System.out.println("My name is " + userName +
                "my favorite number is " + favoriteNumber.toString() +
                " .The date is " + date);

        primitiveDataTypes();
        referenceTypes();
        example();
    }

    /*
     * Experimenting with primitive data types in java
     */
    private static void primitiveDataTypes() {

        /*
         * These data types are used for storing
         * whole numbers
         */
        byte theByte = -128; // holds values between 127 to -128
        short theBigShort = 8_998; // holds values between 32,768 to -32,767
        int theAnt = 74_932; // holds values between -2,147,483,648 to 2,147,483,647
        long longingForYour = 9_234_699_090_20l; // holds enough ...pyscho

        /*
         * These are used for storing floating point
         * values
         */
        float floatingBoat = 78.90f; // holds floating values
        double doubleBounce = 78.455; // holds decimal values

        /*
         * boolean is used for holding true or false
         */
        boolean booFar = false; // True or False Huh?

        /*
         * The char variable holds only one character
         */
        char charcoalIron = 'U'; // Holds a single character

        System.out.println("My favorite byte of 1 byte is :" + theByte);
        System.out.println("I enjoyed the big short movie it was two bytes and i rate it : " + theBigShort);
        System.out.println("My integer my ant man has 4 bytes and is worth: " + theAnt);
        System.out.println("You know i've been long for you for 8 bytes so very " + longingForYour + " much");
        System.out.println("My floating boat is floating to " + floatingBoat + "at 4 bytes");
        System.out.println("You know i double bounce with 8 bytes, you cant keep count of " + doubleBounce);
        System.out.println("Is it foo bar or boo far, thats the 1 bit question. I think its boofar right ? " + booFar);
        System.out.println("My charcoal iron of 2 byte is all for " + charcoalIron);
    }

    /*
     * Non primitive types are referency types
     */
    public static void referenceTypes() {
        String myName = new String("Kosi's Kode");
        System.out.println("My name is : " + myName.toUpperCase());

        LocalDate now = LocalDate.now();

        System.out.println(now);
        System.out.println(now.getMonth());
    }

    /*
     * DIFFERENCE BETTWEEN PRIMITIVES AND REFERENCE TYPES
     */
    private static void example() {

        /*
         * Primitive types
         */
        int a = 10;
        int b = a;

        a = 100;

        System.out.println("A is : " + a);
        System.out.println("B is : " + b);

        /*
         * Reference types
         */
        Person alex = new Person("alex");
        Person mariam = alex;

        alex.name = "alexendra";

        System.out.println("Mariam's name is : " + mariam.name);
        System.out.println("Alex's name is : " + alex.name);
    }

    /**
     * Person
     */
    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
        }

    }
}
