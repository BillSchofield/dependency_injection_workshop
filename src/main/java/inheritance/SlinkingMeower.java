package inheritance;

import static java.lang.System.out;

public class SlinkingMeower extends Meower {

    public void live() {
        out.print("slinks ");
        super.live();
    }
}
