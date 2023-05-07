
<h1 align="center"> Ecommerce-API </h1>

>### Framework  
 * SpringBoot
>### Language 
* Java
 >### Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed . in this created Interfaces
* **Model** - This layer consists basically various classes required for the project and these classes consists the attributes to be stored.

>### Data Structure
This document outlines the steps to create a models-
###  Models
**User Model** -
* id- integer
* name- string
* email- string
* password- string
* phoneNumber- string

**Product Model** -
* id- integer
* name- string
* price- integer
* description- string
* category- string
* brand- string


**Address Model** -
* id- integer
* name- string
* landmark- string
* phoneNumber- string
* zipcode- string
* state- string
* userId- integer (foreign key mapping)

**Order Model** -
* id- integer
* userId- integer (foreign key mapping)
* productId- integer (foreign key mapping)
* addressId- integer (foreign key mapping)
* productQuantity- integer

>### Project Summary

*The above project implements a Ecommerce_API project in which the method provided are:-
 * Create users
 * Create products
 * Create address
 * Place an order (create order) using userId, productId, addressId
 * Get order by order id
 * Get user by userId
 * Get all products
 * Get products based on category (query params)
 * Delete products based on product id.
 
 * The above project implements a Ecommerce_API project in which the endPoint provided are:-
   * Ecommerce/orders
   * Ecommerce/orders/{id}
   * Ecommerce/users/{id}
   * Ecommerce/products
   * Ecommerce/products/RequestParam
   * Ecommerce/productsDelete/{id}
 
       
 
 
 
