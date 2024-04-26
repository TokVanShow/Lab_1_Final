
package Books;

public abstract class FictionBook {

    public String name;
    public String language;
    public int year;

    public FictionBook(String name, String language, int year) {
        this.name = name;
        this.language = language;
        this.year = year;
    }

    public abstract String getFullString();
    
}