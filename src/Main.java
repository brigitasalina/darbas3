import javax.swing.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

 //       String name = "brigita";
        //     System.out.println(name);
       // System.out.println(name.length());
        // System.out.println(name.substring(2));
        //  System.out.println(name.substring(2,4));
        //   System.out.println(name.substring(2,4));
        // System.out.println(name.substring(name.length() -2 ));
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());


        //  System.out.println(name.contains("a"));
        //  System.out.println(name.contains("j"));
        //  System.out.println(name.contains("labas == Labas"));
        // System.out.println(name.contains("labas == Labas"));
        System.out.println("----1---");
        // 1.Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
        // stringus (Jonas Jonaitis). Atspausdinti trumpesnį stringą.

        String name = "Simas";
        String surname = "Antanaitis";

       // System.out.println(name.length());
        //System.out.println(surname.length());

       if( (name.length()) < (surname.length()) )
           System.out.println(name);
       else System.out.println(surname);

        System.out.println("----2---");

        //2.Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
        //stringus. Vardą atspausdinti tik didžiosiom raidėm, o pavardę tik mažosioms.
        //(LEONARDO dicaprio)

        String name1 = "Simonas";
        String surname1 = "Antanaitis";
        System.out.println(name1.toUpperCase());
        System.out.println(surname1.toLowerCase());


        System.out.println("----3---");
        //3.Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
        //stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš pirmų vardo ir
        //pavardės kintamųjų raidžių. Jį atspausdinti.



        String name2 = "Simonas";
        String surname2 = "Antanaitis";
        String initials = name2.substring(0,1) + surname2.substring(0,1);

        System.out.println(initials);

        System.out.println("----4---");
        //4. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
        //stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš trijų paskutinių vardo ir
        //pavardės kintamųjų raidžių. Jį atspausdinti.

        String name4 = "Simonas";
        String surname4 = "Antanaitis";
        String lastLetters = (name4.substring( name4.length() - 3) + (surname4.substring(surname4.length() - 3 )));
       // System.out.println(name4.substring( name4.length() - 3) + (surname4.substring(surname4.length() - 3 )));
        System.out.println(lastLetters);

        System.out.println("----5---");
        //5.Sukurti kintamąjį su stringu: “An American in Paris”. Jame visas “a” (didžiąsias ir
        //mažąsias) pakeisti žvaigždutėm “*”.  Rezultatą atspausdinti.

        String name5 = "An American in Paris";
        System.out.println(name5.replaceAll("[a,A]","*"));

        System.out.println("----6---");
        //6.Sukurti kintamąjį su stringu: “An American in Paris”. Jame ištrinti visas balses. Rezultatą
        //atspausdinti. Kodą pakartoti su stringais: “Breakfast at Tiffany's”, “2001: A Space
        //Odyssey” ir “It's a Wonderful Life”.

        String name6 = " An American in Paris ";
        System.out.println(name6.replaceAll("[AEIOUaeiou]", ""));
        //System.out.println(name6);


        String name7 = "Breakfast at Tiffany's ";
        System.out.println((name7.replaceAll("[AEIOUaeiou]", "")));
        //System.out.println(name7);



        String name8 = "It's a Wonderful Life";
        System.out.println((name8.replaceAll("[AEIOUaeiou]", "")));
        //System.out.println(name8);


        String name9 = "2001: A Space Odyssey";
        System.out.println((name9.replaceAll("[AEIOUaeiou]", "")));
        //System.out.println(name9);


        //7.Stringe, kurį generuoja toks kodas: "Star Wars: Episode "+ " ".repeat( (int)
        //(Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New
        //Hope" Surasti ir atspausdinti epizodo numerį.

        String starWars = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";

































































































    }









}


