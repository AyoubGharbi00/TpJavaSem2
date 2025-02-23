
import java.util.Scanner;

public class app3 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int nl,nc=0,i=0,j=0,som=0;
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

        for ( i = 0; i < nl; i++) {
            for ( j = 0; j < nc; j++) {
            
                 System.out.print(M[i][j]+" ");
                
                }System.out.println();
    
                
            }
            for ( i = 0; i < nl; i++) {
                som=0;
                for ( j = 0; j < nc; j++) {
                    som=som+M[i][j];
                    
                    }System.out.println("ligne"+(i+1)+":"+ som);
                }      

        
    }

}

