package Books;

public class EnglishEducationalBook extends EducationalBook {
    
    protected String author;
    protected String level;
    protected String university;
    
    public EnglishEducationalBook(String subject, String language, String author, String level, String university) {
        super(subject, language);
        this.author = author;
        this.level = level;
        this.university = university;
    }

    @Override
    public String getFullInfo() {
        return "Subject: " + subject + ", Language: " + language + ", Author: " + author + ", Level: " + level +", University: " + university;
    }
}
