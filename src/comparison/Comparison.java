package comparison;

/*
 *  The comparison operators used in java are
 *  < Less than
 *  > Greater than
 *  <= Less than or equal to
 *  >= Greater than or equal to 
 *  == Equal to
 *  != Not equal to
 * 
 *  && and logical operator
 * || or logical operator
 */
public class Comparison {

    public static void main(String[] args) {
        int khalidAge = 23;
        int mariamAge = 23;

        if (khalidAge > mariamAge) {
            System.out.println("Khalid is older than mariam");
        } else if (khalidAge == mariamAge) {
            System.out.println("Khalid and Mariam are the same age");
        } else {
            System.out.println("Mariam is older than Khalid");
        }

        Logical.logicalOperation();
        ageManipulation();
        tenaryOperators();
        swithStatements();
    }

    public static void ageManipulation() {
        int age = 17;
        if(age>=18) {
            System.out.println("You are an adult");
        } else if(age >= 16 && age < 18) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are a child");
        }
        
    }

    public static void tenaryOperators() {
        // Tenary operators
        int age = 17;
        String message = age >= 18 ?
                         "You are an adult" : 
                         "You are a child";
        System.out.println(message);
    }

    public static void swithStatements() {
        String gender = "Female";

        switch (gender) {
            case "Male":
            case "male":
            case "MALE":
                System.out.println("You are a male");
                break;

            case "Female":
            case "female":
            case "FEMALE":
                System.out.println("You are a female");
                break;
        
            default:
                System.out.println("Gender not specified");
                break;
        }
    }
}
