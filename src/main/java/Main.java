import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int suma = 0;

        // Generowanie 5 losowych liczb i ich suma
        for (int i = 0; i < 5; i++) {
            int liczba = random.nextInt(101); // Generowanie liczby z zakresu 0 - 100
            suma += liczba;
            System.out.println("Wylosowana liczba " + (i + 1) + ": " + liczba);
        }

        // Wypisanie sumy
        System.out.println("Suma wylosowanych liczb: " + suma);
    }
}

kalkulator który sprawdzi czy trójkąt jest prostokątny i obliczy jego 