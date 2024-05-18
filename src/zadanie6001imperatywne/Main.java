package zadanie6001imperatywne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> imiona = Arrays.asList("Jakub", "Bartosz", "Milena", "Kamil", "Magdalena");

        long licznik = 0;

        for (String imie : imiona)
        {
            if (imie.length() == 6)
            {
                licznik++;
            }
        }

        System.out.println("Znaleziona " + licznik + " imie.");
    }
}
