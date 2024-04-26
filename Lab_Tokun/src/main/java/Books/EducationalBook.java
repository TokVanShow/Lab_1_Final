
package Books;

public abstract class EducationalBook {

    protected String subject;
    protected String language;
    protected String author;
    

    public EducationalBook(String subject, String language) {
        this.subject = subject;
        this.language = language;
    }
    
    public abstract String getFullInfo();
}
