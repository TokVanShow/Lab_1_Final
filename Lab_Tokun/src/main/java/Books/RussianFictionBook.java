package Books;

public class RussianFictionBook extends FictionBook {

    public RussianFictionBook(String name, String language, int year) {
        super(name, language, year);
    }
    
    @Override
    public String getFullInfo() {
        return "Название: " + name + ", Язык: " + language + ", Год: " + year;
    }
}