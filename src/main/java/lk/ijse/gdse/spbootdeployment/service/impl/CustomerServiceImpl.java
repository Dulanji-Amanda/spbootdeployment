package lk.ijse.gdse.spbootdeployment.service.impl;

import lk.ijse.gdse.spbootdeployment.entity.Customer;
import lk.ijse.gdse.spbootdeployment.repo.CustomerRepository;
import lk.ijse.gdse.spbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return List.of();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return null;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {

    }
}
