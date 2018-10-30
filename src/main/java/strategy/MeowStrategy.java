package strategy;

import static java.lang.System.out;

public class MeowStrategy implements SpeakStrategy {
    public void speak() {
        out.print("and meows");
    }
}
