package Humans;

import Lab1.Storage;

public class HumanFactory {

    public Human createHuman(String type) {

        int index = (int) (Math.random() * 30);
        Storage instance = Storage.getInstance();
        Human user;
        switch (type) {
            case "Student" -> {
                if (index >= 15) {
                    user = new Student(instance.getNames()[index][0], instance.getSurnames()[(int) (Math.random() * 60)][0]);
                    user.setEducationalBooks();
                    user.setFictionBooks();
                    return user;
                } else {
                    user = new Student(instance.getNames()[index][0], instance.getSurnames()[(int) (Math.random() * 60)][0] + "a");
                    user.setEducationalBooks();
                    user.setFictionBooks();
                    return user;
                }
            }
            case "Teacher" -> {
                if (index >= 15) {
                    user = new Teacher(instance.getNames()[index][0], instance.getSurnames(true)[(int) (Math.random() * 15)][0],
                            instance.getNames()[(int) (Math.random() * 15)][1]);
                    
                    user.setEducationalBooks();
                    user.setFictionBooks();
                    return user;
                } else {
                    
                    user = new Teacher(instance.getNames()[index][0], instance.getSurnames(true)[(int) (Math.random() * 15)][0] + "a",
                            instance.getNames()[(int) (Math.random() * 15)][2]);
                    user.setEducationalBooks();
                    user.setFictionBooks();
                    return user;
                }
            }
            default -> {
                System.out.println("Error!");
                return null;
            }
        }
    }
}
