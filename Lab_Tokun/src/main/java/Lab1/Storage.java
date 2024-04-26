package Lab1;

import Books.*;
import BookFactories.*;

import java.io.IOException;
import java.util.ArrayList;

public class Storage {

    private static final String FILE_PATH = "C:\\Users\\user\\Documents\\Lab1.xlsx";
    private static Storage instance;

    private ArrayList<EducationalBook> educationalBooks;
    private ArrayList<FictionBook> fictionBooks;

    private String[][] names;
    private String[][] surnames;
    private String[][] surnames1;
    private String[][] russianDisciplines;
    private String[][] englishDisciplines;

    private final String[] types = {"Laboratory Practice", "Manual", "Textbook", "Problem Book", "Reference Book", "Dictionary", "Answer Book"};
    private final String[] levels = {"Bachelor's", "Master's"};
    private final String[] russianFictionTitles = {"Война и мир", "Анна Каренина", "Мертвые души", "Остров Сокровищ", "Горе от ума", "Евгений Онегин", "Братья Карамазовы", "Андроиды среди нас", "1984", "Унесенные ветром", "Три товарища", "Тихий Дон", "Палата номер 6", "Записки сумасшедшего", "Вишневый сад", "Собачье сердце", "Идиот", "Фауст", "Пиковая дама", "Алиса в стране чудес"};
    private final String[] englishFictionTitles = {"Pride and Prejudice", "To Kill a Mockingbird", "The Great Gatsby", "The Catcher in the Rye", "Brave New World", "The Lord of the Rings", "The Hobbit", "The Hunger Games", "The Chronicles of Narnia", "The Fault in Our Stars", "The Da Vinci Code", "The Alchemist", "Gone with the Wind", "The Kite Runner", "The Handmaid's Tale", "Little Women", "Moby-Dick", "The Grapes of Wrath", "One Hundred Years of Solitude", "The Picture of Dorian Gray", "Dracula", "The Adventures of Sherlock Holmes", "Jane Eyre", "A Tale of Two Cities"};

    private Storage() {
        try {
            names = ExcelReader.readExcelByColumns(FILE_PATH, 2);
            surnames = ExcelReader.readExcelByColumns(FILE_PATH, 3);
            surnames1 = ExcelReader.readExcelByColumns(FILE_PATH, 4);
            russianDisciplines = ExcelReader.readExcelByColumns(FILE_PATH, 1);
            englishDisciplines = ExcelReader.readExcelByColumns(FILE_PATH, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    public void setEducationalBooks() {
        educationalBooks = new ArrayList<>();
        BookFactory russianFactory = new RussianFactory();
        BookFactory englishFactory = new EnglishFactory();
        for (int i = 0; i < 11; i++) {
            educationalBooks.add(russianFactory.createEducationalBook(i, (int) (Math.random() * 23 + 2000)));
            educationalBooks.add(englishFactory.createEducationalBook(i, (int) (Math.random() * 23 + 2000)));
        }
    }

    public void setFictionBooks() {
        fictionBooks = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            fictionBooks.add(new RussianFictionBook(russianFictionTitles[i], "Russian", (int) (Math.random() * 20 + 1800)));
            fictionBooks.add(new EnglishFictionBook(englishFictionTitles[i], "English", (int) (Math.random() * 20 + 1800)));
        }
    }

    public EducationalBook getRandomEducationalBook() {
        return educationalBooks.get((int) (Math.random() * educationalBooks.size()));
    }

    public FictionBook getRandomFictionBook() {
        return fictionBooks.get((int) (Math.random() * fictionBooks.size()));
    }

    public String[][] getNames() {
        return names;
    }

    public String[][] getSurnames() {
        return surnames;
    }

    public String[][] getSurnames(boolean russian) {
        if (russian) {
            return surnames;
        } else {
            return surnames1;
        }
    }

    public String[][] getRussianDisciplines() {
        return russianDisciplines;
    }

    public String[][] getEnglishDisciplines() {
        return englishDisciplines;
    }

    public String[] getTypes() {
        return types;
    }

    public String[] getLevels() {
        return levels;
    }

    public String[] getRussianFictionTitles() {
        return russianFictionTitles;
    }

    public String[] getEnglishFictionTitles() {
        return englishFictionTitles;
    }
}
