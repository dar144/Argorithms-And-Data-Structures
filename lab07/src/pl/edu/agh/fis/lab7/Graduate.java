package pl.edu.agh.fis.lab7;

import java.time.LocalDate;

public class Graduate extends Student{
    private LocalDate graduationDate;


    public Graduate(String firstName, String lastName, int idNumber, double average, LocalDate graduationDate) {
        super(firstName, lastName, idNumber, average);
        this.graduationDate = graduationDate;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate() {
        this.graduationDate = graduationDate;
    }


    @Override
    public String toString() {
        return super.toString() + ", graduation date: " + graduationDate;
    }
}
