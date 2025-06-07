package com.example.lab8_20204205.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DialectOverride;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "proveedor")
@Getter
@Setter
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "razonSocial", nullable = false, length = 100)
    private String razonSocial;

    @Column(name = "nombreComercial", nullable = false, length = 100)
    private String nombreComercial;

    @Column(name = "identificacionTributaria", nullable = false, length = 11)
    private String identificacionTributaria;

    @Column(name = "telefono", nullable = false, length = 11)
    private String telefono;

    @Column(name = "correoElectronico", nullable = false)
    private String correoElectronico;

    @Column(name = "sitioWeb", nullable = false)
    private String sitioWeb;

    @Column(name = "direccionFisica", nullable = false)
    private String direccionFisica;

    @Column(name = "pais", nullable = false)
    private String pais;

    @Column(name = "representanteLegal", nullable = false)
    private String representanteLegal;

    @Column(name = "dniRepresentanteLegal", nullable = false)
    private String dniRepresentanteLegal;

    @Column(name = "tipoProveedor", nullable = false)
    private String tipoProveedor;

    @Column(name = "categoria", nullable = false)
    private String categoria;

    @Column(name = "facturacionAnualDolares", nullable = false)
    private float facturacionAnualDolares;


    @CreationTimestamp
    @Column(name = "fechaRegistro", nullable = true, updatable = false)
    private LocalDateTime fechaRegistro;

    @UpdateTimestamp
    @Column(name = "ultimaActualizacion", nullable = true)
    private LocalDateTime ultimaActualizacion;

    @Column(name = "estado", nullable = false)
    private boolean estado;


















}
