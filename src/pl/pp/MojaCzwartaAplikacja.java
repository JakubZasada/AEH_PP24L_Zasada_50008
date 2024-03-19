package pl.pp;

import java.util.Scanner;

public class MojaCzwartaAplikacja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj dolny limit: ");
            int DolnyLimit = scanner.nextInt();

            System.out.println("Podaj górny limit: ");
            int GórnyLimit = scanner.nextInt();

            if (GórnyLimit <= DolnyLimit) {
                break;
            }

            int SumaKwadratów = obliczSumeKwadratów (DolnyLimit, GórnyLimit);
            System.out.println("Suma kwadratów liczb od " + DolnyLimit + " do " + GórnyLimit + " wynosi " + SumaKwadratów);
        }
    }
    public static int obliczSumeKwadratów(int DolnyLimit, int GórnyLimit) {
        int suma = 0;
        for (int i = DolnyLimit; i <=GórnyLimit; i++) {
            suma += i * i;
        }
        return suma;
    }
}
