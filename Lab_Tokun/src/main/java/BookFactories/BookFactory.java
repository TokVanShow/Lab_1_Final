package BookFactories;

import Books.FictionBook;

import Books.EducationalBook;

public interface BookFactory {

    FictionBook createFictionBook(int index, int year);

    EducationalBook createEducationalBook(int index, int year);
}
