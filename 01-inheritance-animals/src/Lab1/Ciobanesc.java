package Lab1;

public class Ciobanesc extends Caine{
    String rasa="Ciobanesc german";

    public void pazeste(){
        System.out.println("ciobanescul pazeste");
    }

    @Override
    public void mananca() {
        System.out.println("ciobanescul mananca");
    }

    @Override
    public void doarme() {
        System.out.println("ciobanescul doarme");
    }
}
