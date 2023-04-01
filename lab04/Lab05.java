import java.io.*;

import java.util.UUID;
import java.time.LocalDate;

/**
 * Klasa Lab05
 * 
 * 
 * @author Darya Haidukevich
 */
public class Lab05 {

    /**
     * Zwraca liczbę linii w dokumencie shop.csv
     * 
     * @return liczba linii w dokumencie
     */
    public static int docLength() {
        int n = 0;
        try { 
            BufferedReader f = new BufferedReader(
            new FileReader("shop.csv") );
            String s;
            while( (s = f.readLine()) != null )
                n++;
        }
        catch( Throwable e ) { 
            System.out.println( "Blad odczytu pliku!" );
        }
        return n;
    }

    /**
     * Konstuktor domyślny
     */
    Lab05() {}

    /**
     * Testuje wczytywanie pliku, zapisywania wartości poszczególnych linii do
     * tabliczy obiektów User oraz wypisywanie zawartości tej tablicy
     * 
     * @param args argumenty ze standardowego strumienia wejścia
     */
    public static void main(String[] args) {  
        int len = docLength();
        int i = 0;


        User[] listOfUsers = new User[len-1];
        String[] userData = new String[7];

        try { 
            BufferedReader f = new BufferedReader(
            new FileReader("shop.csv") );
            String s = f.readLine();
            
            while( (s = f.readLine()) != null ) {
                userData = s.split(",");
                Person newPerson = new Person(userData[3], userData[4], LocalDate.parse(userData[5]));

                listOfUsers[i] = new User(UUID.fromString(userData[0]), userData[1], userData[2], newPerson);
                i++;
            }
        }
        catch( Throwable e ) { 
            System.out.println( "Blad odczytu pliku!" );
        }

        for(int j = 0; j < len-1; j++) {
            System.out.println(listOfUsers[j]);
        }
    }
}
