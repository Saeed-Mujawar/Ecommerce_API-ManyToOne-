package com.geeksterAssignment.Employee.address.service;

import com.geeksterAssignment.Employee.address.model.Order;
import com.geeksterAssignment.Employee.address.model.Product;
import com.geeksterAssignment.Employee.address.model.User;
import com.geeksterAssignment.Employee.address.repository.IAddressRepository;
import com.geeksterAssignment.Employee.address.repository.IOrderRepository;
import com.geeksterAssignment.Employee.address.repository.IProductRepository;
import com.geeksterAssignment.Employee.address.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private IOrderRepository orderRepository;

    @Autowired
    private IAddressRepository addressRepository;


    public void add(Order myorder) {
        orderRepository.save(myorder);
    }

    public Optional<Order> getOrderById(Integer id) {
        return orderRepository.findById(id);
    }





}
