package pl.pp;
public class mojaPiataAplikacja {
    public static void RzedyZnakow(char znak, int powtorzenia, int rzędy) {
        for (int i = 0; i < rzędy; i++) {
            for (int j = 0; j < powtorzenia; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char znak = '+';
        int powtorzenia = 6;
        int rzędy = 5;

        System.out.println("Rzędy Znaków:");
        RzedyZnakow(znak, powtorzenia, rzędy);
    }
}
