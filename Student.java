/**
 * Created by josem on 3/13/2017.
 */

package poo.isel.aula04;

public abstract class Student {
    protected static int CONSTANT = 0x12345;
    protected int number;
    protected String name;

    public Student(int number, String name) {
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) { this.number = number; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "name = " + name + " number = " + number;
    }
}
