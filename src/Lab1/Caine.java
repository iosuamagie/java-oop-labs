package Lab1;

public class Caine implements Animale{
    String rasa;
    int varsta;

    @Override
    public void mananca() {
        System.out.println("cainele mananca salam");
    }
    @Override
    public void doarme() {
        System.out.println("cainele doarme");
    }
}
