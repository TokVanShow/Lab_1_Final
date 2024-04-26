package Books;

public class RussianEducationalBook extends EducationalBook {

    public String type;
    
    public RussianEducationalBook(String subject, String language, String type) {
        super(subject, language);
        this.type = type;
    }

    @Override
    public String getFullString() {
        return "Дисциплина - " + subject + ", язык - " + language + ", тип - " + type;
    }
    
    
}
