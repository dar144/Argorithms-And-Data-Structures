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
        email = newEmail;
    }


    /**
     * Zapisuje nową wartość do pola przywatnego password
     * 
     * @param newEmail nowa wartość password
     */    
    public void setPassword(String newPassword) {
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


