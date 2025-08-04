package lk.ijse.gdse.spbootdeployment.repo;

import lk.ijse.gdse.spbootdeployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
