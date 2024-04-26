package BookFactories;

import Lab1.Storage;
import Books.*;

public class RussianFactory implements BookFactory {

    @Override
    public FictionBook createFictionBook(int index, int year) {
        return new RussianFictionBook(Storage.getInstance().getRussianFictionTitles()[index], "Russian", year);
    }

    @Override
    public EducationalBook createEducationalBook(int index, int year) {
        return new RussianEducationalBook(Storage.getInstance().getRussianDisciplines()[index][0], "Russian",
                Storage.getInstance().getTypes()[(int) (Math.random() * Storage.getInstance().getTypes().length)]);
    }
}