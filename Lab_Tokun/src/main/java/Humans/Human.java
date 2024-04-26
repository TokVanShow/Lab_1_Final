package Humans;

import Books.*;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import Lab1.*;

public abstract class Human {

    protected String name;
    protected String surname;
    protected ArrayList<FictionBook> fictionBookList = new ArrayList<>();
    protected ArrayList<EducationalBook> educationalBookList = new ArrayList<>();

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setFictionBooks() {
        int count = (int) (Math.random() * 8) + 3;
        FictionBook book;
        for (int i = 0; i < count; i++) {
            book = Storage.getInstance().getRandomFictionBook();
            this.fictionBookList.add(book);
        }
    }

    public ArrayList<FictionBook> getFictionBooks() {
        return this.fictionBookList;
    }

    public FictionBook getBook(int index) {
        return this.fictionBookList.get(index);
    }
    
    public void setEducationalBooks() {
        int count = (int) (Math.random() * 8) + 3;
        EducationalBook book;
        for (int i = 0; i < count; i++) {
            book = Storage.getInstance().getRandomEducationalBook();
            this.educationalBookList.add(book);
        }
    }

    public ArrayList<EducationalBook> getEducationalBooks() {
        return this.educationalBookList;
    }

    public EducationalBook getBook(int index, boolean educational) {
        return this.educationalBookList.get(index);
    }
    
    public void fillNode(DefaultMutableTreeNode node) {
        for (FictionBook book : fictionBookList) {
            node.add(new DefaultMutableTreeNode(book.getFullInfo()));
        }
        for (EducationalBook book : educationalBookList) {
            node.add(new DefaultMutableTreeNode(book.getFullInfo()));
        }
    }
    
    public abstract String getFullName();
}