package ro.ulbs;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        try {
//            printSmallTextFile("in.txt");
//            System.out.println("\n");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }                                      !folosita pentru primu subpunctu a)
//    }
//    static void printSmallTextFile(String fileName) throws IOException {
//        System.out.println();
//        Path path = Paths.get(fileName);
//        List<String> allLinesInMemory = Files.readAllLines(path);
//        for (String line : allLinesInMemory) {
//            System.out.println(line);
//        }
//    }
        StringBuilder line = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("in.txt"))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {  //append=adauga;
                line.append(currentLine);        //optional: .append("\n"); da se vede urat
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nSplit by one space char:\n ");
        String[] words = line.toString().split("\\.");
        for (String w: words) {
            System.out.print(w+"\n");
        }
    }

}
