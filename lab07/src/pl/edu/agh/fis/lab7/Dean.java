package pl.edu.agh.fis.lab7;

public class Dean extends Person{
    private int startYear;
    private String degree;
    private int endYear;

    @Override
    public Person greater(Person ob) {
        if(ob instanceof Dean) {

            int difOb = ((Dean) ob).getEndYear() - ((Dean) ob).getStartYear();
            int difThis = endYear - startYear;

            if(difOb > difThis) {
                return ob;
            } else {
                return (Person)this;
            }
        }
        return null;
    }

    public Dean(String degree, String firstName, String lastName, int startYear, int endYear) {
        super(firstName, lastName);
        this.degree = degree;
        this.startYear = startYear;
        this.endYear = endYear;
    }


    public int getStartYear() {
        return startYear;
    }

    public String getDegree() {
        return degree;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }


    @Override
    public String toString() {
        return degree + " " + super.toString() + ", Dean of the Faculty from " + startYear +
                " to " + endYear;
    }
}
