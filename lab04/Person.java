import java.time.LocalDate;

/**
 * Klasa Person
 * 
 * Reprezentuje dane osoby
 * 
 * @author Darya Haidukevich
 */
public final class Person {
    /** Prywatne niezmienne pole, reprezentuje imię osoby */
    private final String firstName;

    /** Prywatne niezmienne pole, reprezentuje nazwisko osoby */
    private final String lastName;

    /** Prywatne niezmienne pole, reprezentuje datę urodzenia osoby
     * w formacie yyyy-mm-dd
     */
    private final LocalDate dateOfBirth;

    /**
     * Konstuktor klasy Person
     * 
     * @param fName pierwszy parametr, imię osoby
     * @param lName drugi parametr, nazwisko osoby
     * @param birthDate trzeci (ostatni) parametr, data urodzenia osoby
     */
    Person(String fName, String lName, LocalDate birthDate) {
        firstName = fName;
        lastName = lName;
        dateOfBirth = birthDate;
    }

    /**
     * Zwraca imię osoby
     * 
     * @return imię osoby
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * Zwraca nazwisko osoby
     * 
     * @return nazwisko osoby
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Zwraca datę urodzienia osoby
     * 
     * @return data urodzienia osoby
     */
    public LocalDate getDateOfBiirth() {
        return dateOfBirth;
    }


    /**
     * Przeciążenie metody toString(), która wypisuje 
     * w podany sposób obiekt klasy Person
     * 
     * 
     * @return String, reprezentujący obiekt klasy Person
     */
    @Override
    public String toString() {
        return firstName + "," + lastName + "," +
        dateOfBirth;
    }
}
