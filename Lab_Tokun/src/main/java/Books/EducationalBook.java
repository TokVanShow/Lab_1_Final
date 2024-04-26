
package Books;

public abstract class EducationalBook {

    public String subject;
    public String language;
    public String author;
    

    public EducationalBook(String subject, String language) {
        this.subject = subject;
        this.language = language;
    }
    
    public abstract String getFullString();

}
