package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String discipline;

    public Teacher(String name, String discipline) {
        this.name = name;
        this.discipline = discipline;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int x = random.nextInt((4) + 2);
        String s = "";

        switch (x) {
            case 2:
               s = "неудовлетворительно";
                break;
            case 3:
                s = "удовлетворительно";
                break;
            case 4:
                 s = "хорошо";
                break;
            case 5:
                s = "отлично";
                break;
        }

        System.out.println("Преподаватель " + name + "  оценил студента с именем " + student.name + " по предмету " + discipline + " на оценку " + s);
    }
}