import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO{
    private List<User> listaUser;

    public UserDAOImpl() {
        listaUser=new ArrayList<User>();
        listaUser.add(new User("Krystian","Siedlarski",23,0));
        listaUser.add(new User("Werka","Piekacz",22,1));
    }


    public List<User> getAllUsers() {
        return listaUser;
    }

    public User getUser(int numer) {
        return listaUser.get(numer);
    }

    public void updateStudent(User user) {
    listaUser.get(user.getNumer()).setImie(user.getImie());
    }

    public void deleteStudent(User user) {
        listaUser.remove(user.getNumer());
        System.out.println("Uzytkownik o numerze"+user.getNumer()+" został usuniety z bazy");
    }
}
