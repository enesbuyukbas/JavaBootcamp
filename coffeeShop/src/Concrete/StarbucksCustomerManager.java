package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    CustomerCheckService customerCheckService;
    @Override
    public void save(Customer customer) throws Exception {
        if (this.customerCheckService.checkIfRealPerson(customer)){
            super.save(customer);
        }else {
            throw new Exception("Not a valid person");
        }
    }

}
