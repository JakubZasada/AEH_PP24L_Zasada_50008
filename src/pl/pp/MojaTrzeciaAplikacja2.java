package pl.pp;

import java.util.Scanner;
public class MojaTrzeciaAplikacja2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double TemperaturawFahrenheita;

        while (true) {
            System.out.print(" Podaj Temperaturę w Fahrenheitach (wpisz -1 aby zakończyc działanie programu)");
            TemperaturawFahrenheita = scanner.nextDouble();

            if (TemperaturawFahrenheita == -1) {
                System.out.println("Koniec programu");
                break;
            }
            double TemperaturawCelcjuszach = (TemperaturawFahrenheita-32)/1.8;
            double TemperaturawKelvinach = (TemperaturawCelcjuszach+273.16);
            System.out.printf("%.2f Stopni Farenheita = %.2f Stopni Celcjusza = %.2f Stopni Kelvina",
                    TemperaturawFahrenheita, TemperaturawCelcjuszach, TemperaturawKelvinach);
        }
        scanner.close();
    }
}

