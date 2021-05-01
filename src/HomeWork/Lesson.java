package HomeWork;

public class Lesson {
    private int id;
    private String lessonName;
    private String instructorName;
    private String details;

    public Lesson(int id, String lessonName, String instructorName, String details){
        this.id = id;
        this.lessonName = lessonName;
        this.instructorName = instructorName;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
