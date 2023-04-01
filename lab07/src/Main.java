import pl.edu.agh.fis.lab7.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Student("Agnieszka", "Machowska", 465988, 4.5);
        person[1] = new Graduate("Szymon", "Abacki", 123345, 3.0, LocalDate.now());
        person[2] = new Dean("prof. hab. inz.", "Bala", "Babacka", 2000, 2006);

        for(Person p: person) {
            System.out.println(p);
        }
    }
}


