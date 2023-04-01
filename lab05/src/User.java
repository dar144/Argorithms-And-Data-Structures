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


    public int length(String fieldName) {
//        assert fieldName != null: "No field name";

        if(fieldName == "id")
            return ("" + id).length();
        else if(fieldName == "email")
            return email.length();
        else if(fieldName == "password")
            return password.length();
        else if(fieldName == "person")
            return person.length("firstName") + person.length("lastName")
                    + person.length("dateOfBirth");
        else
            return 0;
    }


    /**
     * Konstuktor klasy User
     *
     * @param idNum pirwszy parametr, numer identyfikujący użytkownika
     * @param mail drugi parametr, poczta użytkownika
     * @param passWord trzeci parametr, hasło użytkownika
     * @param pers czwarty (ostatni) parametr, dane personalne użytkownika
     */
    User(UUID idNum, String mail, String passWord, Person pers) {
        assert idNum != null: "No id";
        assert mail!= null: "No email";
        assert passWord != null: "No date of birth";
        assert pers != null: "No person";

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
        assert newEmail != null: "No email";

        email = newEmail;
    }


    /**
     * Zapisuje nową wartość do pola przywatnego password
     *
     * @param newEmail nowa wartość password
     */
    public void setPassword(String newPassword) {
        assert newPassword != null: "No password";

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

}