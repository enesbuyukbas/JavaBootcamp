import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new NeroCustomerManager();
        customerManager.save(new Customer(1,"Enes","Büyükbaş", "12345678912"));

    }
}
