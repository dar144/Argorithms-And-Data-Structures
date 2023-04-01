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
        assert fName != null: "No first name";
        assert lName != null: "No last name";
        assert birthDate != null: "No date of birth";

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
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public int length(String fieldName) {
//        assert fieldName != null: "No field name";

        if(fieldName == "firstName")
            return firstName.length();
        else if(fieldName == "lastName")
            return lastName.length();
        else if(fieldName == "dateOfBirth")
            return ("" + dateOfBirth).length();
        else
            return 0;
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
        Person goodPeson = new Person("dima", "mikialevich", LocalDate.parse("2002-04-03"));
        // Person badPersonFirstName =  new Person(null, "haidukevich", LocalDate.parse("2002-04-05"));
        // Person badPersonLastName =  new Person("daria", null, LocalDate.parse("2002-04-05"));
        // Person badPersoDateOfBirth =  new Person("daria", "haidukevich", null);
        // goodPeson.length(null);



    }


}

