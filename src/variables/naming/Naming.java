package variables.naming;

/*
 * This class discusses principles of naming your
 * variables in java
 */
public class Naming {

    public static void main(String[] args) {
        int one = 1;
        int zero = 0;
        long subscriberCount = 1_000_000;

        System.out.println(one);
        System.out.println(zero);
        System.out.println(subscriberCount);

        workingWithStrings();
    }

    private static void workingWithStrings() {
        String name = new String("Holland");
        char firstLetterOfName = name.charAt(0);
        char lastLetterOfName = name.charAt(name.length() - 1);

        System.out.println(name.toUpperCase());
        System.out.println("First character is : " + firstLetterOfName);
        System.out.println("Last character is : " + lastLetterOfName);
        System.out.println(name.contains("land"));
        System.out.println(name.equalsIgnoreCase("hoLLaNd"));
    }
}
