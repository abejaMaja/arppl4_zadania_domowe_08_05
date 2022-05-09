package pl.sda.arp4;

import java.util.Random;
import java.util.Arrays;

public class Zad3 {
    public static void main(String[] args) {

// zamiast opcji podawania liczb przez uzytkowanika, liczby generuje maszyna
        int[] newTab = generujLosowaTablica(-10, 30);
        System.out.println(Arrays.toString(newTab));

        int suma = sumaElementow(newTab);
        System.out.println("Suma wszystkich liczb ze zbioru =  " + suma);
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

    public static int sumaElementow(int[] tablica) {

        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];

        }
        return suma;
    }


}
