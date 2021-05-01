package HomeWork2;

public class StudentManager {

    public void add(Student student){
        System.out.println(student.getName() + ", adlı öğrenci başarıyla eklendi");
    }

    public void update(Student student){
        System.out.println(student.getName() + ", adlı öğrenci başarıyla güncellendi");
    }

    public void delete(Student student){
        System.out.println(student.getName() + ", adlı öğrenci başarıyla silindi");
    }
}
