package com.geeksterAssignment.Employee.address.repository;

import com.geeksterAssignment.Employee.address.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Integer> {
}
