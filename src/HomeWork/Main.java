package HomeWork;

public class Main {
    public static void main(String[]args){

        Lesson intro = new Lesson(1,"Programlamaya Giriş için Temel Kurs", "Engin Demiroğ", "bla bla bla");
        Lesson cSharp = new Lesson(1,"Java + REACT", "Engin Demiroğ", "bla bla bla");
        Lesson java = new Lesson(1,"C# + ANGULAR", "Engin Demiroğ", "bla bla bla");

        Lesson[] lessons = new Lesson[]{
                intro,
                cSharp,
                java
        };

        for (Lesson lesson : lessons) {
            System.out.println(lesson.getId());
            System.out.println(lesson.getLessonName());
            System.out.println(lesson.getInstructorName());
            System.out.println(lesson.getDetails());
        }

        LessonManager lessonManager = new LessonManager();
        lessonManager.add(intro);
        lessonManager.update(intro);
        lessonManager.delete(intro);

    }
}
