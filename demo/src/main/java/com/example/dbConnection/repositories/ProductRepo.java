package com.example.dbConnection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dbConnection.domain.Product;

@Repository
public interface ProductRepo  extends JpaRepository<Product, String>{

}
