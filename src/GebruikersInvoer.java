import java.util.Scanner;

public class GebruikersInvoer {

   public static void main(String [] arg){

System.out.println("Voer een woord in");

          var s = new Scanner(System.in);

      //      var getal = s.nextInt();

          var tekst = s.nextLine();

          System.out.print("Het woord "+tekst+" heeft ");
          System.out.print(tekst.length());
          System.out.println(" letters");

          System.out.println("Voer een getal in");

          var getal = s.nextInt();

          System.out.println("de tafel van "+getal+" is:");
          System.out.println("1 x "+getal+" = "); System.out.println(1*getal);
       System.out.print("2 x "+getal+" = "); System.out.println(2*getal);
       System.out.print("3 x "+getal+" = "); System.out.println(3*getal);
       System.out.print("4 x "+getal+" = "); System.out.println(4*getal);
       System.out.print("5 x "+getal+" = "); System.out.println(5*getal);
       System.out.print("6 x "+getal+" = "); System.out.println(6*getal);
       System.out.print("7 x "+getal+" = "); System.out.println(7*getal);
       System.out.print("8 x "+getal+" = "); System.out.println(8*getal);
       System.out.print("9 x "+getal+" = "); System.out.println(9*getal);
       System.out.print("10x "+getal+" = "); System.out.println(10*getal);
}
}