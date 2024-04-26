package Humans;

public class Teacher extends Human {

    public String patronymic;

    public Teacher(String name, String surname, String patronymic) {
        super(name, surname);
        this.patronymic = patronymic;
    }

    @Override
    public String getCompleteName() {
        return "Преподаватель " + this.surname + "  " + this.name + " " + this.patronymic;
    }
}
