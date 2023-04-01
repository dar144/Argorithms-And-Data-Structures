package pl.edu.agh.fis.lab7;

public class Student extends Person {
    private int idNumber;
    private double average;
    @Override
    public Person greater(Person ob) {
        if(ob instanceof Student) {
            if(((Student)ob).getAverage() > average) {
                return ob;
            } else {
                return (Person) this;
            }
        }
        return null;
    }
    public Student(String firstName, String lastName, int idNumber, double average) {
        super(firstName, lastName);
        this.idNumber = idNumber;
        this.average = average;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getAverage() {
        return average;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return super.toString() + ", id number: " + idNumber +
                ", average: " + average;
    }
}
