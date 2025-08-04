package lk.ijse.gdse.spbootdeployment.service;

import java.util.List;
import lk.ijse.gdse.spbootdeployment.entity.Customer;
public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    Customer saveCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(Long id);
}
