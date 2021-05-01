package HomeWork2;

public class Student extends User{
    int studentId;

    public Student(int id, String name, String surname, int studentId){
        super(id,name,surname);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
