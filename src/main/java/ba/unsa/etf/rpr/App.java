package ba.unsa.etf.rpr;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int first = scanner.nextInt();
        System.out.println("Unesite drugi broj: ");
        int second = scanner.nextInt();


        System.out.println( "Suma brojeva je: " +(first+second) );

    }


}
