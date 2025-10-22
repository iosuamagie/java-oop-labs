package Main;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("src/main/resources/input.json");

            // Citește lista de persoane
            List<Person> persoane = mapper.readValue(file, new TypeReference<>() {});

            System.out.println("📖 Fișier citit:");
            persoane.forEach(System.out::println);

            // Modifică fiecare persoană — adaugă 1 an la vârstă
            for (Person p : persoane) {
                p.setVarsta(p.getVarsta() + 1);
            }

            // Scrie modificările înapoi în fișier
            mapper.writerWithDefaultPrettyPrinter().writeValue(file, persoane);

            System.out.println("\n✅ Fișierul a fost modificat cu succes!");
            System.out.println("📁 Vezi rezultatul în: src/main/resources/input.json");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
