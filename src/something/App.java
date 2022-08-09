/*
 * Decompiled with CFR 0.152.
 */
package something;

import another.Bar;;

public class App {

    /*
     * This is my sample message
     */
    public static void main(String[] stringArray) throws Exception {
        App.printHello();
        Example example = new Example("kosi");
        example.name();
        Bar.myMessage();

    }

    /*
     * This auto complete for these comments
     * is turning me on
     */
    public static void printHello() {
        System.out.println("Hello, World!");
        System.out.println(countOccurences('l', "Hello, World!"));
    }

    public static int countOccurences(char c, String s) {

        // Implementation 1
        // return s.length() - s.replace(String.valueOf(c), "").length();

        // Implementation 2
        char[] characters = s.toCharArray();
        int count = 0;
        for (char character : characters) {
            if (character == c) {
                count++;
            }
        }

        return count;
    }
}
