import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numere = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int numar = rand.nextInt(21) + 5; // număr între 5 și 25
            numere.add(numar);
        }

        System.out.println("Numere generate: " + numere);

        int sum = numere.stream().reduce(0, Integer::sum);
        System.out.println("Suma: " + sum);

        int max = numere.stream().max(Integer::compare).get();
        System.out.println("Max: " + max);

        int min = numere.stream().min(Integer::compare).get();
        System.out.println("Min: " + min);

        List<Integer> numerepanala20 = numere.stream().filter(p->p<20).toList();
        System.out.println("Numere pana la 20: " + numerepanala20);

        List<Double> doubles = numere.stream().map(p -> p.doubleValue()).toList();
        System.out.println("Map= " + doubles);

    }
}