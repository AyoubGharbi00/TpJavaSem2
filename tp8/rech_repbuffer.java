import java.util.Scanner;

public class rech_repbuffer {
    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String mot1,mot2,x;
        StringBuffer Texte;
        
        int l,p;
        //StringBuffer texte;

        System.out.println("donner un chaine de charactere");
        Texte=new StringBuffer(sc.nextLine());

        while (Texte.length() > 50) {
            System.out.println("donner un chaine de charactere");
         Texte= new StringBuffer(sc.nextLine());
        }


        System.out.println("donner mot1");
        mot1=sc.nextLine();

        while (mot1.length()> 10) {
            System.out.println("donner mot1");
        mot1=sc.nextLine();

            
        }
        System.out.println("donner mot2");
        mot2=sc.nextLine();

        while (mot2.length() > 10) {
            System.out.println("donner mot2");
        mot2=sc.nextLine();
            
        }
        if (Texte.indexOf(mot1)==-1) {
            System.out.println(mot1+" n'existe pas dans le texte");

            
        }
        else{
            Texte = new StringBuffer(Texte.toString().replace(mot1,mot2));
            System.out.println("le nouveau texte est"+ Texte);
            
           
        }
 


    }
}
