package pl.sda.arp4;

import java.util.Random;
import java.util.Arrays;
import static pl.sda.arp4.Zad3.sumaElementow;

public class Zad4 {
    public static void main(String[] args) {

// zamiast opcji podawania liczb przez uzytkowanika, liczby generuje maszyna
        int[] newTab = generujLosowaTablica(-10, 30);
        System.out.println(Arrays.toString(newTab));

        int suma = sumaElementow(newTab);
        System.out.println("Suma wszystkich liczb ze zbioru =  " + suma);

        int maxElement = znajdzMaxElement(newTab);
        System.out.println("Twoje maksimum: " + maxElement);

        int minElement = znajdzMinElement(newTab);
        System.out.println("Twoje minimum: " + minElement);
    }

    public static int[] generujLosowaTablica(int x, int y) {
// [x,y] => zakres zbioru, z ktorego losujemy liczby calkowite
// funkcja zwraca tablice liczb calkowitych, dodatnich lub ujemnych

        System.out.println("Maszyna losuje liczby z zakresu [" + x + ", " + y + "]");

        int[] tablica = new int[10];

// licznik na potrzeby zliczenia wystapienia ilosci zer
        int licznik = 0;


        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(y - x + 1) + x;
            if (wylosowanaLiczba != 0) {
                tablica[i] = wylosowanaLiczba;

            } else {
                licznik += 1;
                // wylosowane 0 wiec cofam sie od jedno miejsce w tablicy
                i--;

            }

        }
        System.out.println("W czasie losowania liczb odrzucono " + licznik + " zer");
        System.out.println();

        return tablica;
    }


    private static int znajdzMaxElement(int[] tablica) {

        int maxElement = tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            if (maxElement < tablica[i]) {
                maxElement = tablica[i];
            }
        }
        return maxElement;
    }

    private static int znajdzMinElement(int[] tablica) {

        int minElement = tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            if (minElement > tablica[i]) {
                minElement = tablica[i];
            }
        }
        return minElement;
    }

}
