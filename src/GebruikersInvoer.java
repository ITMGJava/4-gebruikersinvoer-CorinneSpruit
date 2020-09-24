import java.util.Scanner;

public class GebruikersInvoer {

   public static void main(String [] arg){

System.out.println("Voer een woord in");

          var s = new Scanner(System.in);

      //      var getal = s.nextInt();

          var tekst = s.nextLine();

          System.out.print("Het woord "+tekst+" heeft ");
          System.out.print(tekst.length());
          System.out.print(" letters");


   }
}
