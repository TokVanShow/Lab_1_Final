package BookFactories;

import Lab1.Storage;
import Books.*;

public class RussianFactory implements BookFactory {

    @Override
    public FictionBook createFictionBook(int a, int b) {

        return new RussianFictionBook(Storage.getInstance().returnRuFicList()[a], "�������", b);
    }

    @Override
    public EducationalBook createEducationalBook(int a, int b) {
        return new RussianEducationalBook(Storage.getInstance().returnRuDisciplines()[a][0], "�������", Storage.getInstance().returnTypes()[b]);
    }
}
