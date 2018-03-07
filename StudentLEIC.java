/**
 * Created by josem on 3/13/2017.
 */

package poo.isel.aula04;

public class StudentLEIC extends Student {
    private double gradeSec;
    private double gradeIng;
    public StudentLEIC(int number, String name,
                       double gradeSec, double gradeIng) {
        super(number, name);
        this.gradeIng = gradeIng;
        this.gradeSec = gradeSec;
    }

    public double getGradeSec() {
        return gradeSec;
    }

    public void setGradeSec(double gradeSec) {
        this.gradeSec = gradeSec;
    }

    public double getGradeIng() {
        return gradeIng;
    }

    public void setGradeIng(double gradeIng) {
        this.gradeIng = gradeIng;
    }

    public String toString() {
        return super.toString() +
                " gradeSec= " + gradeSec +
                " gradeIng = " + gradeIng;
    }
}
