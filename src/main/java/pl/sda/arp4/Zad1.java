package pl.sda.arp4;

import java.util.Random;
import java.util.Scanner;


public class Zad1 {
    public static void main(String[] args) {

        int liczba= 0;

        System.out.println("Wybierz dowolną liczbę 0 lub 1 ");
        System.out.println("0 dane podaje użytkownik ");
        System.out.println("1 dane podaje maszyna ");

        int wybor = opcjeWyboru();

        switch (wybor) {
            case 0:
                System.out.println("Dane startowe podawane przez użytkowanika ");
                liczba = losUzytkownika();
                break;
            case 1:
                System.out.println("Dane startowe losuje maszyna");
                liczba = losowaLiczba(-5, 100);
                break;
        }


            System.out.println();
            System.out.println("Dzielniki dla wylosowanej liczby " + liczba + " to: ");
            System.out.println();
            dzielniki(liczba);


    }
        public static int losowaLiczba ( int x, int y){
            // funkcja losuje dodatnia liczbe z danego zakresu
            // [x,y] => zakres zbioru, z ktorego losujemy liczbe calkowita dodatnia


            System.out.println("Maszyna losuje liczby z zakresu [" + x + ", " + y + "]");

            int wylosowanaLiczba = new Random().nextInt(y - x + 1) + x;
            if (wylosowanaLiczba >= 0) {
                wylosowanaLiczba = wylosowanaLiczba;
            }
            return wylosowanaLiczba;

        }


        public static void dzielniki ( int liczba){
// funkcja wyswietla dzielniki dla dowolnej liczby

            for (int i = 1; i <= liczba; i++) {
                if (liczba % i == 0) {
                    System.out.print(i + ", ");
                }
            }
        }

        public static int opcjeWyboru () {
            Scanner sc = new Scanner(System.in);
            int wybor = sc.nextInt();
            return wybor;
        }

        public static int losUzytkownika () {

            System.out.println("Podaj dowolną liczbę dodatnią ");
            Scanner sc = new Scanner(System.in);
            int los = sc.nextInt();
            return los;

        }


    }


