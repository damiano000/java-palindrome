import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();


        // Verifico se la parola è palindroma

        int lunghezza = parola.length();
        boolean flag= true;
        for (int i = 0; i < lunghezza; i++) {
            if (parola.charAt(i) != parola.charAt(lunghezza - 1 - i)) {
               flag= false;
                break;
            }
        }

        // Stampo il risultato
        if (flag) {
            System.out.println("La parola inserita è palindroma ");
        } else {
            System.out.println("La parola inserita non è palindroma ");
        }
    }
}