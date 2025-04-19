import java.util.Scanner;
public class app1 {

    public static int lectureN ( ){
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("donner un entier");
        n=sc.nextInt();
        while (n<0 ) { 
            System.out.println("donner un entier");
            n=sc.nextInt();
            
        }
        return n;



    }
    public static void remplirTab(float[] t, int n) {
        Scanner sc = new Scanner(System.in); 
        for (int i = 0; i < n; i++) {
            System.out.print("Remplir la case [" + i + "] : ");
            t[i] = sc.nextFloat();
        }

        
    }
    public static void remplacer(int []t, int n, int x1,int x2){
        for (int i = 0; i < t.length; i++) {
        if (t[i]==x1) {
            t[i]=x2;
        }
    }
    }
    public static void afficher(int []t){
        System.out.println("Contenu du tableau :");
        for (int i = 0; i < t.length; i++) {
            System.out.println("le tableau est"+t[i]);
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = lectureN();
        int[] t = new int[n];

        remplirTab(t, n);

        System.out.print("Donner x1 : ");
        int x1 = sc.nextInt();

        System.out.print("Donner x2 : ");
        int x2 = sc.nextInt();

        remplacer(t,n, x1, x2);
        afficher(t);
    }
}
