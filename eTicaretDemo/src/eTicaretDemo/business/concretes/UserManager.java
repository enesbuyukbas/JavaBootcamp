package eTicaretDemo.business.concretes;

import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.core.abstracts.GoogleService;
import eTicaretDemo.core.concretes.GoogleManagerAdapter;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.dataAccess.concretes.HibernateUserDao;
import eTicaretDemo.entities.concretes.User;

public class UserManager implements UserService {
    @Override
    public void newUser(User user) {
    Conditions conditions = new Conditions();
    boolean checkPassword = conditions.passwordCheck(user);
    boolean emailFormat = conditions.eMailFormat(user);

    if (checkPassword && emailFormat){
        UserDao userDao1 = new HibernateUserDao();
        userDao1.add(user);
        System.out.println("Kayıt başarılı");
        return;
    }else{
        System.out.println("Kayıt başarısız");
    }

    }

    @Override
    public void login(String eMail, String password) {
        UserDao userDao = new HibernateUserDao();
        userDao.login(eMail, password);
    }

    @Override
    public void googleLogin(User user) {
        GoogleService googleService = new GoogleManagerAdapter();
        googleService.gLogin("Google ile giriş yapıldı");
    }

    @Override
    public void delete(User user) {
        UserDao userDao = new HibernateUserDao();
        userDao.delete(user);
    }
}
