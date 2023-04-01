import java.time.LocalDate;
import java.util.UUID;

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
        assert fName != null : "Konstruktor Person: nie podany firstName" ;
        assert lName != null : "Konstruktor Person: nie podany lastName" ;
        assert birthDate != null : "Konstruktor Person: nie podany dateOfBirth" ;

        assert fName != "" : "Konstruktor Person: firstName jest pusty";
        assert lName != "" : "Konstruktor Person: lastName jest pusty";

        assert birthDate.isAfter(LocalDate.parse("1900-01-01")) &&
                birthDate.isBefore(LocalDate.parse("1999-12-31")): "Konstruktor Person: dateOfBirth nie jest pomiedzy 1900-01-01 a 1999-12-31";

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

    public boolean checkPESEL(long pesel) {
        assert pesel != 0 : "Funkcja checkPESEL (klasa Person): nie podany firstName" ;

        int day = dateOfBirth.getDayOfMonth();
        int month = dateOfBirth.getMonthValue();
        int year = dateOfBirth.getYear() - 1900;

        if(year == Math.round(Math.floor(pesel/1e9)))
            if(month == Math.round(Math.floor(pesel/1e7) - year*1e2))
                if(day == Math.round(Math.floor(pesel/1e5) - year*1e4 - month*1e2))
                    return true;

        return false;
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

    public static void main(String[] args) {
        Person person = new Person("", "", LocalDate.parse("2006-01-24"));
    }
}
