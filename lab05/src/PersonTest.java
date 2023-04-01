import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person = new Person("Daria", "Haidukevich", LocalDate.parse("2002-04-05"));


    @Test
    public void testAssertEquals() {
        System.out.print("PersonTest -> assertEquals");

        int expectedFirstName = 5;
        int expectedLastName = 11;
        int expectedDateOfBirth = 10;

        assertEquals(expectedFirstName, person.length("firstName"));
        assertEquals(expectedLastName, person.length("lastName"));
        assertEquals(expectedDateOfBirth, person.length("dateOfBirth"));
    }


    @Test
    public void testAssertNotNull() {
        System.out.print("PersonTest -> assertNotNull");

        assertNotNull(person.getFirstName());
        assertNotNull(person.getLastName());
        assertNotNull(person.getDateOfBirth());
    }

}