package com.geeksterAssignment.Employee.address.repository;

import com.geeksterAssignment.Employee.address.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByCategory(String category);


    @Modifying
    @Query(value = "DELETE FROM Address,user,product WHERE id = :ProductId" , nativeQuery = true)
    void DeleteProductBasedOnId(Integer ProductId);


}
