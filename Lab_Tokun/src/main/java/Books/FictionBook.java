
package Books;



public abstract class FictionBook {

    protected String name;
    protected String language;
    protected int year;

    public FictionBook(String name, String language, int year) {
        this.name = name;
        this.language = language;
        this.year = year;
    }

    public abstract String getFullInfo();
}
