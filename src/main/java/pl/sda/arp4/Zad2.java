package pl.sda.arp4;

import java.util.*;
import java.util.Random;
import java.util.Arrays;

public class Zad2 {
    public static void main(String[] args) {

// zamiast opcji podawania liczb przez uzytkowanika, liczby generuje maszyna
        int[] newTab = generujLosowaTablica(-10, 10);
        System.out.println(Arrays.toString(newTab));

        int maxElement = znajdzMaxElement(newTab);
        System.out.println("Twoje maksimum: " + maxElement);
    }

    public static int[] generujLosowaTablica(int x, int y) {
// [x,y] => zakres zbioru, z ktorego losujemy liczby calkowite
// funkcja zwraca tablice liczb calkowitych, tylko dodatnich

        System.out.println("Maszyna losuje liczby z zakresu [" + x + ", " + y + "]");

        int[] tablica = new int[5];

// funkcjonalnosc aby zebrac ujemne liczby i nie deklarowac z gory rozmiaru tablicy
        List<Integer> ujemne = new ArrayList<>();

        int licznik = 0;

        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(y - x + 1) + x;
            if (wylosowanaLiczba > 0) {
                tablica[i] = wylosowanaLiczba;

            } else {
                // dodaje tylko ujemne liczby, aby sprawdzic czy program dobrze dziala
                ujemne.add(wylosowanaLiczba);
                licznik += 1;
                // gdy wylosowana liczba, to cofam sie, aby jeszcze jeden los na to miejsce tablicy
                i--;

            }

        }
        System.out.println("W czasie losowania liczb odrzucono " + licznik + " liczb(y) mniejsze od zera");
        System.out.println("Odrzucone liczby to " + ujemne);
        System.out.println();

        return tablica;
    }

    public static int znajdzMaxElement(int[] tablica) {

        int maxElement = tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            if (maxElement < tablica[i]) {
                maxElement = tablica[i];
            }
        }
        return maxElement;
    }


}
