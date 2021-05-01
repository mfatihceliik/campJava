package HomeWork2;

public class Student extends User{
    int studentId;

    public Student(int id, String name, String surname, int studentId){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.studentId = studentId;
    }
}
