import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("ange förnamn efternamn ålder längd vikt");
        String data1 = tangentbord.nextLine();
      
        
        
        int plats1 = data1.indexOf(" ");
        String f_namn = data1.substring(0,plats1);

        int plats2 = data1.indexOf(" ",plats1+1);
        String e_namn = data1.substring(plats1+1 , plats2);

        int plats3 = data1.indexOf(" ",plats2+1);
        String ålder = data1.substring(plats2+1 , plats3);

        int plats4 = data1.indexOf(" ", plats3+1);
        String längd = data1.substring(plats3+1 , plats4);

        int plats5 = data1.indexOf(" ", plats4+1);
        String vikt = data1.substring(plats4+1, plats5);



      
        System.out.println(f_namn);
        System.out.println(e_namn);
          System.out.println(ålder);
        System.out.println(längd);
         System.out.println(vikt);
            

         Double viktint;
         viktint = Double.valueOf(vikt);

         System.out.print(vikt);
            }
}


