package Books;

public class RussianEducationalBook extends EducationalBook {

    protected String type;
    
    public RussianEducationalBook(String subject, String language, String type) {
        super(subject, language);
        this.type = type;
    }

    @Override
    public String getFullInfo() {
        return "Дисциплина - " + subject + ", язык - " + language + ", тип - " + type;
    }
}
