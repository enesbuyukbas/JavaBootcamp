package eTicaretDemo.business.abstracts;

import eTicaretDemo.entities.concretes.User;

public interface UserService {
    void newUser(User user);
    void login(String eMail, String password);
    void googleLogin(User user);
    void delete(User user);
}
