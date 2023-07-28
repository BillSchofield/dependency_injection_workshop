package strategy;

import static java.lang.System.out;

public class Tiger {
    private final String name;
    private final MoveStrategy mover;
    private final SpeakStrategy speaker;

    public Tiger() {
        name = "tiger";
        mover = new SlinkStrategy();
        speaker = new RoarStrategy();
    }

    public void live() {
        out.print("The " + name + " ");
        mover.move();
        speaker.speak();
        out.println("!");
    }
}
