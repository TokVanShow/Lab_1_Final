package Lab1;

import Books.*;
import java.io.IOException;
import BookFactories.*;

import java.util.ArrayList;

public class Storage {

    ArrayList<EducationalBook> EducationalBooks;
    ArrayList<FictionBook> FictionBooks;
    String filepath = "C:\\Users\\user\\Documents\\Lab1.xlsx";

    String[][] names;
    String[][] surnames;
    String[][] surnames1;
    String[][] RuDisciplines;
    String[][] EnDisciplines;

    public Storage() {
        try {
            names = ExcelReader.readExcelByColumns(filepath, 2);
            surnames = ExcelReader.readExcelByColumns(filepath, 3);
            surnames1 = ExcelReader.readExcelByColumns(filepath, 4);
            RuDisciplines = ExcelReader.readExcelByColumns(filepath, 1);
            EnDisciplines = ExcelReader.readExcelByColumns(filepath, 0);
        } catch (IOException e) {
            e.printStackTrace();
            // Обработка ошибки, если возникла проблема при чтении файла
        }
    }
    String[] types = {"Лабораторный практикум", "Пособие", "Учебник", "Задачник", "Справочник", "Словарь", "Решебник"};
    String[] levels = {"Бакалавриат", "Магистратура"};
    String[] RuFicList = {"Война и мир", "Анна Каренина", "Мертвые души", "Остров Сокровищ", "Горе от ума", "Евгений Онегин", "Братья Карамазовы", "Андроиды среди нас", "1984", "Унесенные ветром", "Три товарища", "Тихий Дон", "Палата номер 6", "Записки сумасшедшего", "Вишневый сад", "Собачье сердце", "Идиот", "Фауст", "Пиковая дама", "Алиса в стране чудес"};
    String[] EnFicList = {"Pride and Prejudice", "To Kill a Mockingbird", "The Great Gatsby", "The Catcher in the Rye", "Brave New World", "The Lord of the Rings", "The Hobbit", "The Hunger Games", "The Chronicles of Narnia", "The Fault in Our Stars", "The Da Vinci Code", "The Alchemist", "Gone with the Wind", "The Kite Runner", "The Handmaid's Tale", "Little Women", "Moby-Dick", "The Grapes of Wrath", "One Hundred Years of Solitude", "The Picture of Dorian Gray", "Dracula", "The Adventures of Sherlock Holmes", "Jane Eyre", "A Tale of Two Cities"};

    public void setEducationalBooks() {
        EducationalBooks = createEducationalBooks();
    }

    public void setFictionBooks() {
        FictionBooks = createFictionBooks();
    }

    private static Storage INSTANCE;

    public static Storage getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Storage();
        }
        return INSTANCE;
    }

    public String[][] returnNames() {
        return names;
    }

    public String[][] returnSurnames() {
        return surnames;
    }

    public String[][] returnSurnames(boolean a) {
        return surnames1;
    }

    public String[][] returnEnDisciplines() {
        return EnDisciplines;
    }

    public String[][] returnRuDisciplines() {
        return RuDisciplines;
    }

    public String[] returnTypes() {
        return types;
    }

    public String[] returnRuFicList() {
        return RuFicList;
    }

    public String[] returnEnFicList() {
        return EnFicList;
    }

    public String[] returnLevels() {
        return levels;
    }

    public ArrayList<EducationalBook> returnEducationalBooks() {
        return EducationalBooks;
    }

    public ArrayList<FictionBook> returnFictionBooks() {
        return FictionBooks;
    }

    public FictionBook returnRandomFictionBook() {
        int a = (int) (Math.random() * returnFictionBooks().size());
        return FictionBooks.get(a);
    }

    public EducationalBook returnRandomEducationalBook() {
        int a = (int) (Math.random() * returnEducationalBooks().size());
        return EducationalBooks.get(a);
    }

    public ArrayList<EducationalBook> createEducationalBooks() {
        EnglishFactory englishfactory = new EnglishFactory();
        RussianFactory russianfactory = new RussianFactory();
        ArrayList<EducationalBook> books = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 2; j++) {
                books.add(englishfactory.createEducationalBook(i, j));
                books.add(russianfactory.createEducationalBook(i, j));
            }
        }
        return books;
    }

    public ArrayList<FictionBook> createFictionBooks() {
        EnglishFactory englishfactory = new EnglishFactory();
        RussianFactory russianfactory = new RussianFactory();
        ArrayList<FictionBook> books = new ArrayList<>();
        for (int i = 0; i < EnFicList.length; i++) {
            books.add(englishfactory.createFictionBook(i, (int) (Math.random() * 70) + 1950));
        }
        for (int j = 0; j < RuFicList.length; j++) {
            books.add(russianfactory.createFictionBook(j, (int) (Math.random() * 90) + 1930));
        }

        return books;
    }
}
