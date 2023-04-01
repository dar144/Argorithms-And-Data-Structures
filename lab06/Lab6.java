import java.io.*;

import java.util.UUID;
import java.time.LocalDate;

/**
 * Klasa Lab06
 *
 *
 * @author Darya Haidukevich
 */
public class Lab6 {
    public static void main(String[] args) {
        Person person = new Person("Ala", "Abacka", LocalDate.parse("1973-01-24"));
        boolean x = person.checkPESEL(73012412312L);
        System.out.println(x);
    }
}
