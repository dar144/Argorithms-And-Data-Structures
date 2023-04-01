import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void testConstructor() {
        System.out.println("testConstructor");
        Person person = new Person("Ala", "Abacka", LocalDate.parse("1973-01-24"));

        assertNotNull(person.getFirstName());
        assertNotNull(person.getLastName());
        assertNotNull(person.getDateOfBiirth());

        assertEquals("Ala", person.getFirstName());
        assertEquals("Abacka", person.getLastName());
        assertEquals("1973-01-24", ""+person.getDateOfBiirth());

        assertSame("Ala", person.getFirstName());
        assertSame("Abacka", person.getLastName());
    }

    @Test
    public void testCheckPESEL() {
        System.out.println("testCheckPESEL");
        Person person = new Person("Ala", "Abacka", LocalDate.parse("1973-01-24"));

        assertTrue(person.checkPESEL(73012412312L));
        assertFalse(person.checkPESEL(12312312312L));

    }




}
