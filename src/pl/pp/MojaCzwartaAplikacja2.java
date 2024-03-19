package pl.pp;

import java.util.Scanner;

public class MojaCzwartaAplikacja2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu: ");
            System.out.println(" 1. Dodawanie");
            System.out.println(" 2. Odejmowanie");
            System.out.println(" 3. Mnożenie");
            System.out.println(" 4. Dzielenie");
            System.out.println(" 5. Wyłącz Kalkulator ");

            System.out.println("Wybierz opcję : ");
            int opcja = scanner.nextInt();

            if (opcja == 5) {
                System.out.println("Wyłączyłeś Kalkulator");
                break;
            }
            if (opcja < 1 || opcja > 5) {
                System.out.println("Nieprawidłowa opcja , spróbuj ponownie ");
                continue;
            }

            System.out.println("Podaj pierwszą liczbę: ");
            double liczba1 = scanner.nextDouble();
            System.out.println("Podaj drugą liczbę: ");
            double liczba2 = scanner.nextDouble();

            switch (opcja) {
                case 1:
                    System.out.println("Wynik Dodawania: " + (liczba1 + liczba2));
                    break;
                case 2:
                    System.out.println("Wynik Odejmowania: " + (liczba1 - liczba2));
                    break;
                case 3:
                    System.out.println("Wynik Mnożenia: " + (liczba1 * liczba2));
                    break;
                case 4:
                    if (liczba2 == 0) {
                        System.out.println("Nie można dzielić przez 0, spróbuj ponownie ");
                    } else {
                        System.out.println("Wynik Dzielenia: " + (liczba1 / liczba2));
                    }
                    break;
            }
        }
    }
    }