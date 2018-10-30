import strategy.MeowStrategy;
import strategy.MoveStrategy;
import strategy.SlinkStrategy;
import strategy.SpeakStrategy;

public class Main {
    public static void main(String[] args) {
        inline.Cat inlineCate = new inline.Cat();
        inlineCate.live();

        strategy.Cat strategyCat = new strategy.Cat();
        strategyCat.live();

        inheritance.Animal inheritanceCat = new inheritance.Cat();
        inheritanceCat.live();

        SpeakStrategy speaker = new MeowStrategy();
        MoveStrategy mover = new SlinkStrategy();
        injected.Animal injectedCat = new injected.Animal("cat", speaker, mover);
        injectedCat.live();
    }
}
