package Humans;

import Books.*;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import Lab1.*;

public abstract class Human {

    public String name;
    public String surname;
    ArrayList<FictionBook> FictionList = new ArrayList<>();
    ArrayList<EducationalBook> EducationalList= new ArrayList<>();

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setFictionlistOfBooks() {
        int a = (int) (Math.random() * 8) + 3;
        FictionBook book;
        for (int i = 0; i < a; i++) {
            book = Storage.getInstance().returnRandomFictionBook();
            this.FictionList.add(book);
        }
    }

    public ArrayList<FictionBook> getFictionlistOfBooks() {
        return this.FictionList;
    }

    public FictionBook getBook(int i) {
        return this.FictionList.get(i);
    }
    
    public void setEducationallistOfBooks() {
        int a = (int) (Math.random() * 8) + 3;
        EducationalBook book;
        for (int i = 0; i < a; i++) {
            book = Storage.getInstance().returnRandomEducationalBook();
            this.EducationalList.add(book);
        }
    }

    public ArrayList<EducationalBook> getEducationallistOfBooks() {
        return this.EducationalList;
    }

    public EducationalBook getBook(int i,boolean a) {
        return this.EducationalList.get(i);
    }
    
    public void fillNode(DefaultMutableTreeNode node) {
        for (FictionBook book : FictionList) {
            node.add(new DefaultMutableTreeNode(book.getFullString()));
        }
        for (EducationalBook book : EducationalList) {
            node.add(new DefaultMutableTreeNode(book.getFullString()));
        }
    }
    
    public abstract String getCompleteName();
}
