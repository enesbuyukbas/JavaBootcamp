package eTicaretDemo;

import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.business.concretes.UserManager;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.dataAccess.concretes.HibernateUserDao;
import eTicaretDemo.entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new HibernateUserDao();
        UserService userService = new UserManager();

        User enes = new User(1,"Enes","Büyükbaş","enes_bykbss@hotmail.com","12356a");
        userService.newUser(enes);

        User enes2 = new User(2,"Enes2","Büyükbaş2","enes_bykbss@hotmail.com","12341235");
        userService.newUser(enes2);
    }
}
