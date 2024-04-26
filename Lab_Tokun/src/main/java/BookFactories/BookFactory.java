package BookFactories;

import Books.FictionBook;

import Books.EducationalBook;

public interface BookFactory {

    FictionBook createFictionBook(int a, int b);

    EducationalBook createEducationalBook(int a, int b);
}
