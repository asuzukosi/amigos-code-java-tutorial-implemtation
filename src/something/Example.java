/*
 * Decompiled with CFR 0.152.
 */
package something;

public class Example {
    private String name;

    Example() {
    }

    Example(String string) {
        this.name = string;
    }

    private String getName() {
        if (this.name == null) {
            return "example";
        }
        return this.name;
    }

    public void name() {
        System.out.println("My name is " + this.getName());
    }
}
