package HomeWork;

public class LessonManager {

    public void add(Lesson lesson){
        System.out.println(lesson.getLessonName() + ", başarıyla eklendi !");
    }
    public void delete(Lesson lesson){
        System.out.println(lesson.getLessonName()  + ", başarıyla silindi !");
    }
    public void update(Lesson lesson){
        System.out.println(lesson.getLessonName()  + ", başarıyla güncellendi !");
    }
}
