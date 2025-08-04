package lk.ijse.gdse.spbootdeployment.controller;


import lk.ijse.gdse.spbootdeployment.entity.Customer;
import lk.ijse.gdse.spbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    @GetMapping
    public String getCustomer() {
        return "Customer 1";
    }
    @PostMapping
    public ResponseEntity<Customer>saveCustomer(@RequestBody Customer customer) {
        // Logic to save the customer
        return ResponseEntity.ok(customerService.saveCustomer(customer));
    }
}
