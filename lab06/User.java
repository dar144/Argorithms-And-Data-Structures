import java.time.LocalDate;
import java.util.UUID;

/**
 * Klasa User
 *
 * Reprezentuje dane użytkownika
 *
 * @author Darya Haidukevich
 */
public class User {
    /** Prywatne niezmienne pole, reprezentuje numer identyfikujący użytkownika */
    private final UUID id;

    /** Prywatne pole, reprezentuje pocztę użytkownika */
    private String email;

    /** Prywatne pole, reprezentuje hasło użytkownika */
    private String password;

    /** Prywatne niezmienne pole, reprezentuje dane personalne użytkownika */
    private final Person person;


    /**
     * Konstuktor klasy User
     *
     * @param idNum pirwszy parametr, numer identyfikujący użytkownika
     * @param mail drugi parametr, poczta użytkownika
     * @param passWord trzeci parametr, hasło użytkownika
     * @param pers czwarty (ostatni) parametr, dane personalne użytkownika
     */
    User(UUID idNum, String mail, String passWord, Person pers) {
        assert idNum != null : "Konstruktor User: nie podany id" ;
        assert mail != null : "Konstruktor User: nie podany email" ;
        assert passWord != null : "Konstruktor User: nie podany password" ;
        assert pers != null : "Konstruktor User: nie podany person" ;

        assert mail != "" : "Konstruktor User: email jest pusty";
        assert passWord != "" : "Konstruktor User: password jest pusty";

        assert pers.getDateOfBiirth().isAfter(LocalDate.parse("1900-01-01")) &&
                pers.getDateOfBiirth().isBefore(LocalDate.parse("1999-12-31")): "Konstruktor User: dateOfBirth nie jest pomiedzy 1900-01-01 a 1999-12-31";

        assert mail.contains("@") : "Konstruktor User: email nie zawiera znak '@'";

        id = idNum;
        email = mail;
        password = passWord;
        person = pers;
    }


    /**
     * Zwraca numer identyfikujący użytkownika
     *
     * @return numer identyfikujący użytkownika
     */
    public UUID getId() {
        return id;
    }

    /**
     * Zwraca pocztę użytkownika
     *
     * @return poczta użytkownika
     */
    public String getEmail() {
        return email;
    }

    /**
     * Zwraca hasło użytkownika
     *
     * @return hasło użytkownika
     */
    public String getPassword() {
        return password;
    }

    /**
     * Zwraca dane personale użytkownika
     *
     * @return dane personalne użytkownika
     */
    public Person getPerson() {
        return person;
    }


    /**
     * Zapisuje nową wartość do pola przywatnego email
     *
     * @param newEmail nowa wartość email
     */
    public void setEmail(String newEmail) {
        assert newEmail != null : "Funkcja setEmail (klasa User): nie podany email" ;
        assert newEmail != "" : "Funkcja setEmail (klasa User): email jest pusty";
        assert newEmail.contains("@") : "Funkcja setEmail (klasa User): email nie zawiera znak '@'";

        email = newEmail;
    }


    /**
     * Zapisuje nową wartość do pola przywatnego password
     *
     * @param newPassword nowa wartość password
     */
    public void setPassword(String newPassword) {
        assert newPassword != null : "Funkcja setPassword (klasa User): nie podany password" ;
        assert newPassword != "" : "Funkcja setPassword (klasa User): password jest pusty";

        password = newPassword;
    }


    /**
     * Przeciążenie metody toString(), która wypisuje
     * w podany sposób obiekt klasy User
     *
     *
     * @return String, reprezentujący obiekt klasy User
     */
    @Override
    public String toString() {
        return id + "," + email + "," + password + "," +
                person;
    }

    public static void main(String[] args) {
        Person person = new Person("Ala", "Abacka", LocalDate.parse("2006-01-24"));
        User user = new User(UUID.fromString("aadbed8e-ca01-4c7f-a9cd-8794fb41dfd9"), "oheberrrusgs.gov", "", person);

        user.setEmail("");
        user.setPassword("");
    }

}


