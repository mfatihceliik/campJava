package HomeWork2;

public class Instructor extends User{
    private int instructorId;

    public Instructor(int id, String name, String surname, int instructorId){
        super(id,name,surname);
        this.instructorId = instructorId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }
}
