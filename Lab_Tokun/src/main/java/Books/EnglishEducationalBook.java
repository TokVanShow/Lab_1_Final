package Books;

public class EnglishEducationalBook extends EducationalBook {
    
    public String author;
    public String level;
    public String uni;
    
    public EnglishEducationalBook(String subject, String language, String author, String level, String uni) {
        super(subject, language);
        this.author = author;
        this.level = level;
        this.uni = uni;
    }

    @Override
    public String getFullString() {
        return "���������� - " + subject + ", ���� - " + language + ", ����� - " + author + ", ������� - " + level +", ����������� - " + uni  ;
    }
}
