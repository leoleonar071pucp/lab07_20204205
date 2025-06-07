package com.example.lab8_20204205.controller;

import com.example.lab8_20204205.entity.Proveedor;
import com.example.lab8_20204205.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/proveedor")
public class ProveedorController {

    final ProveedorRepository proveedorRepository;

    public ProveedorController(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;


    }
    @GetMapping
    public List<Proveedor> lista() {
        return proveedorRepository.findAll();
    }

    @PostMapping
    public Proveedor createProveedor(@RequestBody Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proveedor> getProveedor(@PathVariable Integer id) {
        Optional<Proveedor> proveedor = proveedorRepository.findById(id);
        return proveedor.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Void> deleteProveedor(@PathVariable Integer id1) {
        proveedorRepository.deleteById(id1);
        return ResponseEntity.noContent().build();
    }


}
