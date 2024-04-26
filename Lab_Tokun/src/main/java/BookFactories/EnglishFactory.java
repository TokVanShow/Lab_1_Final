
package BookFactories;

import Lab1.Storage;
import Books.*;

public class EnglishFactory implements BookFactory {     
    @Override
    public FictionBook createFictionBook(int a, int b) {
        return new EnglishFictionBook(Storage.getInstance().returnEnFicList()[a],"English",b);
    }

    @Override
    public EducationalBook createEducationalBook(int a, int b) {
  
        return new EnglishEducationalBook(Storage.getInstance().returnEnDisciplines()[a][0],"English",Storage.getInstance().returnEnDisciplines()[a][2],
                Storage.getInstance().returnLevels()[b],Storage.getInstance().returnEnDisciplines()[a][1]);
    }
}