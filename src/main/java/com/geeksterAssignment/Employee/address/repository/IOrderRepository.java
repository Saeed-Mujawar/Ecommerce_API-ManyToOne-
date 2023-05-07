package com.geeksterAssignment.Employee.address.repository;

import com.geeksterAssignment.Employee.address.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Integer> {

}
