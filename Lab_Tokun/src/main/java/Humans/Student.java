
package Humans;

public class Student extends Human {

    public Student(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String getFullName() {
        return "Student " + this.surname + "  " +  this.name;
    }
}