import java.util.List;

public interface UserDAO {
   List<User> getAllUsers();
    User getUser(int numer);
    void updateStudent(User user);
    void deleteStudent(User user);
}
