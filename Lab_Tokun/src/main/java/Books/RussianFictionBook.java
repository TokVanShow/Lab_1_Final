package Books;

public class RussianFictionBook extends FictionBook {

    public RussianFictionBook(String name, String language, int year) {
        super(name, language, year);
    }
    
    @Override
    public String getFullString() {
        return "�������� - " + name + ", ���� - " + language + ", ��� - " + year;
    }
}
