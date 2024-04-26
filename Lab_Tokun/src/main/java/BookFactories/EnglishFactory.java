
package BookFactories;

import Lab1.Storage;
import Books.*;

public class EnglishFactory implements BookFactory {

    @Override
    public FictionBook createFictionBook(int index, int year) {
        return new EnglishFictionBook(Storage.getInstance().getEnglishFictionTitles()[index], "English", year);
    }

    @Override
    public EducationalBook createEducationalBook(int index, int year) {
        return new EnglishEducationalBook(Storage.getInstance().getEnglishDisciplines()[index][0], "English",
                Storage.getInstance().getEnglishDisciplines()[index][2],
                Storage.getInstance().getLevels()[(int) (Math.random() * Storage.getInstance().getLevels().length)],
                Storage.getInstance().getEnglishDisciplines()[index][1]);
    }
}