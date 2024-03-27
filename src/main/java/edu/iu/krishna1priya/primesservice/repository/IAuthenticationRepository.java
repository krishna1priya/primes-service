package edu.iu.krishna1priya.primesservice.repository;

import edu.iu.krishna1priya.primesservice.model.Customer;
import org.springframework.security.config.Customizer;

import java.io.IOException;

public interface IAuthenticationRepository {
    boolean save(Customer customer) throws IOException;
    Customer findByUsername(String username) throws IOException;
}