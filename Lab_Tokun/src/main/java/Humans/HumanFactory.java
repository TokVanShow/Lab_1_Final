package Humans;

import Lab1.Storage;

public class HumanFactory {

    public Human createHuman(String type) {

        int i = (int) (Math.random() * 30);
        Storage instance = Storage.getInstance();
        Human user;
        switch (type) {
            case "Студент" -> {
                if (i >= 15) {
                    user = new Student(instance.returnNames()[i][0], instance.returnSurnames()[(int) (Math.random() * 60)][0]);
                    user.setEducationallistOfBooks();
                    user.setFictionlistOfBooks();
                    return user;
                } else {
                    user = new Student(instance.returnNames()[i][0], instance.returnSurnames()[(int) (Math.random() * 60)][0] + "а");
                    user.setEducationallistOfBooks();
                    user.setFictionlistOfBooks();
                    return user;
                }
            }
            case "Преподаватель" -> {
                if (i >= 15) {
                    user = new Teacher(instance.returnNames()[i][0], instance.returnSurnames(true)[(int) (Math.random() * 15)][0],
                            instance.returnNames()[(int) (Math.random() * 15)][1]);
                    
                    user.setEducationallistOfBooks();
                    user.setFictionlistOfBooks();
                    return user;
                } else {
                    
                    user = new Teacher(instance.returnNames()[i][0], instance.returnSurnames(true)[(int) (Math.random() * 15)][0] + "а",
                            instance.returnNames()[(int) (Math.random() * 15)][2]);
                    user.setEducationallistOfBooks();
                    user.setFictionlistOfBooks();
                    return user;
                }
            }
            default -> {
                System.out.println("отскок!");
                return null;
            }
        }
    }
}
