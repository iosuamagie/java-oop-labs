package ro.ulbs.paradigme.lab3.util.PasswordMaker;
import java.util.Random;

public class PasswordMaker {
    private static PasswordMaker instance = null;
    private static final int MAGIC_NUMBER;
    private static final String magicString;
    private String name;

    static {
        MAGIC_NUMBER = new Random().nextInt(6) + 5;
        magicString = new StringRandomizer().getRandomString(20);
        instance = null;
    }

    private PasswordMaker(String name) {
        this.name=name;
    }

    public String getPassword() {
        StringRandomizer randomizer=new StringRandomizer();
        Random random=new Random();

        String randomString= randomizer.getRandomString(MAGIC_NUMBER);

        StringBuilder magicSubString=new StringBuilder(10);
        for(int i=0;i<10;i++){
        int index= random.nextInt(magicString.length());
        magicSubString.append(magicString.charAt(index));
        }

        String nameLength = String.valueOf(name.length());

        int randomInt=random.nextInt(51);
        return randomString + magicSubString + nameLength + randomInt;
    }
    public static PasswordMaker getInstance(String parola) {
        if(instance == null) {
            instance = new PasswordMaker(parola);
        }
        return instance;
    }
}
