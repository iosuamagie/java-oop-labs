package ro.ulbs.paradigme.lab3.util.PasswordMaker;

import java.util.Random;

public class StringRandomizer {
    private static final String CHARACTERS = "1234567890ABCDEFGHIJKLMN1234567890ABCDEFGHIJKLMN12312312";
    private Random random;

    public StringRandomizer() {
        random = new Random();
    }

    public String getRandomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }
}

