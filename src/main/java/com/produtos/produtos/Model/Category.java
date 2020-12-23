package com.produtos.produtos.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="TB_CATEGORY")
public class Category {
    private Long id;
    private String name;

    @OneToMany(mappedBy="TB_CATEGORY")
    private Set<Product> products;
}
