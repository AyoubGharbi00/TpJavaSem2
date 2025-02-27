import java.util.Scanner;

public class rech {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String text,mot1,mot2;
        int l,p;
        System.out.println("saisir un texte");
        text=sc.nextLine();
        System.out.println("saisir un mot1");
        mot1=sc.nextLine();
        System.out.println("saisir un mot2");
        mot2=sc.nextLine();
        if (text.indexOf(mot1)==-1) {
            System.out.println("mot 1 n'existe pas dans le texte");
            
        }
        else{
             l =mot1.length();
            while (text.indexOf(mot1)!=0) {
                 p= text.indexOf(mot1);
                 Void delete(text,p,l);
                 StringBuffer insert(mot2,texte,p);

                

                
            }
        }
        System.err.println("le nouveau texte est"+ text);

        

    }
}
