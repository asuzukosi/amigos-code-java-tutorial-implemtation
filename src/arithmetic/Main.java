package arithmetic;

/*
 * Java uses BODMAS to determine the sequence for executing operations
 */
public class Main {
    public static void main(String[] args) {
        byte ten = 10;
        byte two = 2;
        System.out.println(addition(ten, two));
        System.out.println(subraction(ten, two));
        System.out.println(divide(two, ten));
        System.out.println(multiply(ten, two));

        System.out.println(Math.abs(-34));
        System.out.println((int)Math.sqrt(49)); 
        System.out.println(Math.PI);
    }

    private static int addition(int a, int b) {
        return a + b;
    }

    private static int subraction(int a, int b) {
        return a - b;
    }

    private static float divide(int a, int b) {
        return (float)a / (float)b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

}
