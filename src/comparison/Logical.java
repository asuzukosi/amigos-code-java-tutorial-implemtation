package comparison;

public class Logical {
    protected static void logicalOperation() {
        // Logical Operators
        boolean isAdult = true;
        boolean isMarried = false;
        boolean isSingle = !isMarried;
        boolean isStudent = false;

        if (isAdult && isSingle) {
            System.out.println("You are eligible to get a loan");
        } else {
            System.out.println("You are not eligible to get a loan");
        }

        if (isAdult || isStudent) {
            System.out.println("You are eligible to get a free plan");
        } else {
            System.out.println("You are not eligible to get a free plan");
        }
        if (!isAdult || shortCircuit()){
            System.out.println("Testing out short circuiting");
        }
    }


    public static boolean shortCircuit() {
        System.out.println("Printing the short circuit");
        return true;
    }
}
