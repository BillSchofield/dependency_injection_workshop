package inheritance;

import static java.lang.System.out;

public class Cat extends SlinkingMeower {
    public void live() {
        out.print("The cat ");
        super.live();
        out.println("!");
    }
}
