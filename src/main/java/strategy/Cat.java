package strategy;

import static java.lang.System.out;

public class Cat {
    private final String name;
    private final MoveStrategy mover;
    private final SpeakStrategy speaker;

    public Cat() {
        name = "cat";
        mover = new SlinkStrategy();
        speaker = new MeowStrategy();
    }

    public void live() {
        out.print("The " + name + " ");
        mover.move();
        speaker.speak();
        out.println("!");
    }
}
