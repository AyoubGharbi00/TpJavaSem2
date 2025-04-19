import java.util.Scanner;

public class AppT {

    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner la taille du tableau (n > 0) : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    public static void remplirTab(int[] t, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Donner l'élément T[" + i + "] (positif) : ");
                t[i] = sc.nextInt();
            } while (t[i] < 0);
        }
    }

    public static int[] creerTpair(int[] t, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] % 2 == 0) count++;
        }

        int[] t_pair = new int[count];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] % 2 == 0) {
                t_pair[j] = t[i];
                j++;
            }
        }
        return t_pair;
    }

    public static int[] creerTimpair(int[] t, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] % 2 != 0) count++;
        }

        int[] t_impair = new int[count];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] % 2 != 0) {
                t_impair[j] = t[i];
                j++;
            }
        }
        return t_impair;
    }

    public static void afficheTab(int[] t, String nom) {
        System.out.print(nom + " : ");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = lectureN();
        int[] T = new int[n];

        remplirTab(T, n);

        int[] T_pair = creerTpair(T, n);
        int[] T_impair = creerTimpair(T, n);

        afficheTab(T, "Tableau T");
        afficheTab(T_pair, "Tableau T_pair (pairs)");
        afficheTab(T_impair, "Tableau T_impair (impairs)");
    }
}
