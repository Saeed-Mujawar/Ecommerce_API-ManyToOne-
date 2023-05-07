package com.geeksterAssignment.Employee.address.service;

import com.geeksterAssignment.Employee.address.model.Product;
import com.geeksterAssignment.Employee.address.repository.IProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private IProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(String category)
    {// by request Param
        return productRepository.findByCategory(category);
    }


    @Transactional
    public void deleteProductById(Integer id) {
        productRepository.DeleteProductBasedOnId(id);
//        productRepository.deleteById(id);
    }


}
