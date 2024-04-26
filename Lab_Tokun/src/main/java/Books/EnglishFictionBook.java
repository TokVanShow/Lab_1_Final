package Books;

public class EnglishFictionBook extends FictionBook {

    public EnglishFictionBook(String name, String language, int year) {
        super(name, language, year);
    }

    @Override
    public String getFullString() {
        return "�������� - " + name + ", ���� - " + language + ", ��� - " + year;
    }
}
