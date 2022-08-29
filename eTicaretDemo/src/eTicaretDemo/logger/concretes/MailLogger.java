package eTicaretDemo.logger.concretes;

import eTicaretDemo.entities.concretes.User;
import eTicaretDemo.logger.abstracts.Logger;

public class MailLogger implements Logger {
    @Override
    public void log(User user) {
        System.out.println("Mail ile loglandı "+ user.geteMail());
    }
}
