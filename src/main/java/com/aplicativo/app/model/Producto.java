package com.aplicativo.app.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "t_product")

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descripcion;
    private BigDecimal precio;
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    private String imageFileName;
    private String status;
}
