public class DAOApplication {
    public static void main(String[] args){
    UserDAO userDAO=new UserDAOImpl();
    //Wypisanie wszystkich userow
    for(User user:userDAO.getAllUsers()){
        System.out.println(user.toString());
    }
    }
}
