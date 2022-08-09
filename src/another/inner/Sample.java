package another.inner;

import another.Foo;

public class Sample {

    /*
     * The sampleMessage method is calling
     * a class that is in a higher directory than it
     */
    public static void sampleMessage() {
        System.out.println("This is a sample message");
        Foo.fooMessage();
    }
}
