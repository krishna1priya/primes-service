package edu.iu.krishna1priya.primesservice.service;

import edu.iu.krishna1priya.primesservice.model.Customer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.io.IOException;

public interface IAuthenticationService {
    boolean register(Customer customer) throws IOException;
    boolean login(String username,String password) throws IOException;

    UserDetails loadUserByUsername(String username)
        throws UsernameNotFoundException;
}