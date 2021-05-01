package HomeWork2;

public class UserManager {

    public void Add(User user){
        System.out.println(user.getName() + ", başarıyla eklendi");
    }
    public void Update(User user){
        System.out.println(user.getName() + ", başarıyla güncellendi");
    }
    public void Delete(User user){
        System.out.println(user.getName() + ", başarıyla silindi");
    }
}
