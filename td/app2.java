import java.util.Scanner;

public class app2 {
    public static float calcul_moy(float[] t, int n) {
        int nb=0;
        for (int i = 0; i < n; i++) {
            nb=nb+i; 
        }
        nb=nb/n;
        return (float) nb;
    }
    public static int NombreNote(float[] t,int n,float nb ) {
         int nombre=0;
        for (int i = 0; i < n; i++) {
            if ((t[i])> nb) {
                nombre++;
                
            }
            
        }
        return nombre;
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = app1.lectureN();
        float[] t = new float[n];
        app1.remplirTab(t, n);
        float nb = calcul_moy(t, n);
        int nbrs = NombreNote(t, n, nb);
        System.out.println("Moyenne des notes : " + nb);
        System.out.println("Nombre de notes supérieures à la moyenne : " + nbrs);
    }
        
       
    }
    

