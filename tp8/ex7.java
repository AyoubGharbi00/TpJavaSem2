import java.util.Scanner;

public class ex7 {
public static void main(String[] args) {
    String verbe;
    Scanner sc=new Scanner(System.in);
do { 
    System.out.println("donner un verbe");
    verbe=sc.nextLine();

    
} while (! verbe.endsWith("er") || verbe.equals("aller") );
    
    
    System.out.println("je :"+verbe.replace("er","e" ));
    System.out.println("tu :"+verbe.replace("er","es"));
    System.out.println("il/elle : "+verbe.replace("er","e"));
   if (verbe.endsWith("ger")) {
     System.out.println("nous : "+verbe.replace("er","eons"));
   }
   else if (verbe.endsWith("cer")) {
    System.out.println("nous : "+verbe.replace("cer","çons"));
 
    
   }
   else{
    System.out.println("nous :"+verbe.replace("er","ons"));
    

   }
    System.out.println("vous :"+verbe.replace("er","ez"));
    System.out.println("ils/elles :"+verbe.replace("er","ent"));

    
}

}