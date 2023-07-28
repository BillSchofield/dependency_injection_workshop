import injected.Animal;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        inline.Cat inlineCate = new inline.Cat();
        inlineCate.live();

        strategy.Cat strategyCat = new strategy.Cat();
        strategyCat.live();

        inheritance.Animal inheritanceCat = new inheritance.Cat();
        inheritanceCat.live();

        Animal injectedCat = createCat();
        injectedCat.live();
    }

    private static Animal createCat() {
        SpeakStrategy speaker = new MeowStrategy();
        MoveStrategy mover = new SlinkStrategy();
        return new Animal("cat", speaker, mover);
    }
}
