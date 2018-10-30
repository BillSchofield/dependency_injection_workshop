package injected;

import strategy.MoveStrategy;
import strategy.SpeakStrategy;

import static java.lang.System.out;

public class Animal {
    private final String name;
    private final SpeakStrategy speaker;
    private final MoveStrategy mover;

    public Animal(String name, SpeakStrategy speaker, MoveStrategy mover) {
        this.name = name;
        this.speaker = speaker;
        this.mover = mover;
    }

    public void live() {
        out.print("The " + name + " ");
        mover.move();
        speaker.speak();
        out.println("!");

    }
}
