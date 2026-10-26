package Lab1;

public class Pisica implements Animale{
    String rasa;
    int varsta;
    public void leneveste(){
        System.out.println("pisica leneveste");
    }

    @Override
    public void mananca() {
        System.out.println("pisica mananca peste");
    }
    @Override
    public void doarme() {
        System.out.println("pisica doarme");
    }

}
