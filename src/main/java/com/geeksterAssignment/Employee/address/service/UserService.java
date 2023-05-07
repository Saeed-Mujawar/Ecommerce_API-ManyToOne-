package com.geeksterAssignment.Employee.address.service;

import com.geeksterAssignment.Employee.address.model.Order;
import com.geeksterAssignment.Employee.address.model.User;
import com.geeksterAssignment.Employee.address.repository.IOrderRepository;
import com.geeksterAssignment.Employee.address.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


    @Autowired
    private IUserRepository userRepository;


    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }

}
