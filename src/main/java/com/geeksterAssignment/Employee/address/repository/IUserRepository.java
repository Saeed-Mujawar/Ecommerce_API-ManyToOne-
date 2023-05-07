package com.geeksterAssignment.Employee.address.repository;

import com.geeksterAssignment.Employee.address.model.Order;
import com.geeksterAssignment.Employee.address.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
}
