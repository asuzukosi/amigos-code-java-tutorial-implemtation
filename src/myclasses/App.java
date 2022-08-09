package myclasses;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        // Create a new instance of the SampleClass class
        SampleClass sampleClass = new SampleClass("kosi", 10);
        System.out.println(sampleClass.name);
        System.out.println(sampleClass.count);

        // Create a new instance of Lens
        Lens lens = new Lens("Canon", 50.0, true);
        System.out.println(lens.brand);
        System.out.println(lens.focalLength);

        // Create another instance of Lens
        Lens otherLens = new Lens("Sony", 60.00, false);
        System.out.println(otherLens.brand);
        System.out.println(otherLens.focalLength);

        // Create a new instance of Passport
        Passport passport = new Passport("1234567", LocalDate.of(2023, 7, 23));
        System.out.println(passport.number);
        System.out.println(passport.expiryDate);

        System.out.println("Done.");
    }
}
