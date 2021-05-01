package HomeWork2;

public class Main {
    public static void main(String[] args){
        Instructor instructor = new Instructor(1, "Engin", "Demiroğ", 1);
        Student student = new Student(2, "Muhammed Fatih", "Çelik", 1);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        instructorManager.update(instructor);
        instructorManager.delete(instructor);

        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        studentManager.update(student);
        studentManager.delete(student);
    }
}
