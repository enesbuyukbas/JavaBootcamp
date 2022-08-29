package eTicaretDemo.core.concretes;

import eTicaretDemo.core.abstracts.GoogleService;
import eTicaretDemo.googleEntry.Google;

public class GoogleManagerAdapter implements GoogleService {
    @Override
    public void gLogin(String message) {
        Google google = new Google();
        google.googleEntry(message);
    }
}
