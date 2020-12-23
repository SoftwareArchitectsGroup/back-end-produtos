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
@Table(name="TB_BRAND")
public class Brand {
    private Long id;
    private String Name;

    @OneToMany(mappedBy="TB_BRAND")
    private Set<Product> products;
}
