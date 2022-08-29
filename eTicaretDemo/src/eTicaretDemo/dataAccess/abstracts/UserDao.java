package eTicaretDemo.dataAccess.abstracts;

import eTicaretDemo.entities.concretes.User;

public interface UserDao {
    void add(User user);
    void delete(User user);
    boolean login(String eMail, String password);
    boolean eMailCheck(String eMail);

}
