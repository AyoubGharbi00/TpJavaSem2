

//modification
import java.util.Scanner;

public class app2 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int nl,nc=0,i,j,som=0,  produit=1;
        int[][] M=new int [20][30];
        System.out.println("donner le nombre de ligne");
        nl=sc.nextInt();
        while (nl>30) {
            System.out.println("donner le nombre de ligne");
        nl=sc.nextInt();
            
        }
        System.out.println("donner le nombre de colonne");
        nc=sc.nextInt();
        while (nc>30) {
            System.out.println("donner le nombre de colonne");
        nc=sc.nextInt();
    }
        System.out.println("remplire le matrice");

        for ( i = 0; i < nl; i++) {
            for (j = 0; j < nc; j++) {
                System.out.println("M["+i+","+j+"]=");
                M[i][j]=sc.nextInt();
            }
        }

        for ( i = 0; i < nc; i++) {
            for ( j = 0; j < nl; j++) {
                 som=som+M[i][j];
                 produit=produit*M[i][j];
                
                } 
    
                
            }
            System.out.println("la somme de tableau"+som);
            System.out.println("la produit de tableau"+produit);

        
    }

}

