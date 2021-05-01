package HomeWork2;

public class Main {
    public static void main(String[] args){
        Instructor instructor = new Instructor(1, "Engin", "Demiroğ", 1);
        Student student = new Student(2, "Muhammed Fatih", "Çelik", 1);

        User user = new User(3, "Nejla", "Çelik");

        UserManager userManager = new UserManager();
        userManager.Add(instructor);
        userManager.Add(student);
        userManager.Add(user);
    }
}
