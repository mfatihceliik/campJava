package HomeWork2;

public class InstructorManager {
    public void add(Instructor instructor){
        System.out.println(instructor.getName() + ", adlı eğitmen başarıyla eklendi");
    }

    public void update(Instructor instructor){
        System.out.println(instructor.getName() + ", adlı eğitmen başarıyla güncellendi");
    }

    public void delete(Instructor instructor){
        System.out.println(instructor.getName() + ", adlı eğitmen başarıyla silindi");
    }
}
