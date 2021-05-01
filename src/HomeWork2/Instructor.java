package HomeWork2;

public class Instructor extends User{
    int instructorId;

    public Instructor(int id, String name, String surname, int instructorId){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.instructorId = instructorId;
    }
}
