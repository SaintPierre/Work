package com.example.demo.w;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*"
, allowedHeaders = "*")
@RestController
public class Api {
@Autowired
Repository cartRepo;
@GetMapping("api/v1/carts")
public List<Cart> getAll() {
return cartRepo.findAll();
}
@GetMapping("api/v1/cart/{id}")
public Cart getCart(@PathVariable("id") Integer id) {
return cartRepo.findById(id);
}
}

