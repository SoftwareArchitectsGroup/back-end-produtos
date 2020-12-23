package com.produtos.produtos.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="TB_PRODUCT")
public class Product {
    private Long code;
    private String name;
    private Double price;
    private byte[] image;

    @ManyToOne
    @JoinColumn(name="brand_id", nullable=false)
    private Brand brand;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category category;
}
