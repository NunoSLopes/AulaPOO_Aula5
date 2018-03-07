package poo.isel.aula04;

/**
 * Created by josem on 3/13/2017.
 */
public class StudentMEIC extends Student {
    private double grade3years;

    public StudentMEIC(int number, String name, double grade3years) {
        super(number, name);
        this.grade3years = grade3years;
    }

    public double getGrade3years() {
        return grade3years;
    }

    public void setGrade3years(double grade3years) {
        this.grade3years = grade3years;
    }

    public String toString() {
        return super.toString() + " grade3years = " + grade3years;
    }
}
