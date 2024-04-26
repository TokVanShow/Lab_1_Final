package Humans;

public class Teacher extends Human {

    protected String patronymic;

    public Teacher(String name, String surname, String patronymic) {
        super(name, surname);
        this.patronymic = patronymic;
    }

    @Override
    public String getFullName() {
        return "Teacher " + this.surname + "  " + this.name + " " + this.patronymic;
    }
}