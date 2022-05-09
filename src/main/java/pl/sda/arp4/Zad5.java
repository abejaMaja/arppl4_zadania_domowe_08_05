package pl.sda.arp4;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {



        int x = losowaLiczba(1, 49);
        int[] newTab = losowaTablica(1, 49);
        System.out.println(Arrays.toString(newTab));
        System.out.println("Maszyna wylosowała liczbę " + x);
        System.out.println("Czy liczba x = " + x + ", losowana przez maszyne znajduje sie w losowym zbiorze liczb? ");
        System.out.println("Odpowiedz: " + isValueInData(x, newTab));

    }


    public static int losowaLiczba(int x, int y) {
// funkcja losuje dodatnia liczbe z danego zakresu
// [x,y] => zakres zbioru, z ktorego losujemy liczbe calkowita dodatnia


        System.out.println("Maszyna losuje liczby z zakresu [" + x + ", " + y + "]");

        int wylosowanaLiczba = new Random().nextInt(y - x + 1) + x;
        if (wylosowanaLiczba >= 0) {
            wylosowanaLiczba = wylosowanaLiczba;
        }
        return wylosowanaLiczba;

    }

    public static int[] losowaTablica(int x, int y) {
// [x,y] => zakres zbioru, z ktorego losujemy liczby calkowite

        int[] tablica = new int[5];

        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(y - x + 1) + x;

            tablica[i] = wylosowanaLiczba;
        }


        return tablica;
    }

    public static boolean isValueInData(int x, int[] tablica) {
        String a = " ";
        for (int i = 0; i < tablica.length; i++) {

            if (tablica[i] == x) {
                a = "TAK";
            }

        }
        if (a.equals("TAK")) {
            return true;
        } else {
            return false;
        }


    }
}
