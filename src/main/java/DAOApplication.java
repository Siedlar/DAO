public class DAOApplication {
    public static void main(String[] args){
    UserDAO userDAO=new UserDAOImpl();
    //Wypisanie wszystkich userow
    for(User user:userDAO.getAllUsers()){
        System.out.println(user.toString());
    }
        //pobranie uzytkownika
        User user=userDAO.getUser(0);
        System.out.println( user.toString());
    //update uzytkownika
        User user1=userDAO.getUser(1);
        user1.setImie("Andrzej");
        userDAO.updateStudent(user1);
        for(User usercx:userDAO.getAllUsers()){
            System.out.println(usercx.toString());
        }
        //delete uzytkownika
        User user2=userDAO.getUser(1);
        userDAO.deleteStudent(user2);
        for(User userx:userDAO.getAllUsers()){
            System.out.println(userx.toString());
        }
    }

}
