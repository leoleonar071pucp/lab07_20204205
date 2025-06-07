package com.example.lab8_20204205.controller;

import com.example.lab8_20204205.entity.Proveedor;
import com.example.lab8_20204205.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class ProveedorController {

    final ProveedorRepository proveedorRepository;

    public ProveedorController(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    @GetMapping("/api/Proveedor")
    public List<Proveedor> lista() {
        return proveedorRepository.findAll();
    }



}
