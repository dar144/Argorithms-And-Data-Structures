import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void testLength() {
        System.out.print("User: testLength");
        User user = new User()
        int expectedResult =


        assert fieldName != null: "No field name";

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
}