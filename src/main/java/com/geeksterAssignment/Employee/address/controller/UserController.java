package com.geeksterAssignment.Employee.address.controller;

import com.geeksterAssignment.Employee.address.model.Order;
import com.geeksterAssignment.Employee.address.model.Product;
import com.geeksterAssignment.Employee.address.model.User;
import com.geeksterAssignment.Employee.address.service.OrderService;
import com.geeksterAssignment.Employee.address.service.ProductService;
import com.geeksterAssignment.Employee.address.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/ecommerce")
public class UserController {

    @Autowired
    OrderService orderService;

    @Autowired
    ProductService productService;

    @Autowired
    UserService userService;


    @PostMapping(value = "/orders")
    public void createOrder(@RequestBody Order Myorder)
    {
         orderService.add(Myorder);
    }

    @GetMapping(value = "/orders/{id}")
    public Optional<Order> getOrderById(@PathVariable Integer id) {
        return orderService.getOrderById(id);
    }

    @GetMapping(value = "/users/{id}")
    public Optional<User> getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping(value = "/products")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @GetMapping(value = "/products/{category}")
    public List<Product> getProductsByCategory(@PathVariable String category) {
        return productService.getProductsByCategory(category);
    }

    @DeleteMapping(value = "/productsDelete/{id}")
    public void deleteProductById(@PathVariable Integer id) {
        productService.deleteProductById(id);
    }



}

