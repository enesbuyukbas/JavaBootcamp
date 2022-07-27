package Entities;

import Abstract.Entitiy;

import java.util.Date;

public class Customer implements Entitiy {

    public int id;
    public String firstName;
    public String lastName;
    public String nationalityId;


    public Customer(int id, String firstName, String lastName,String nationalityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
    }

}
