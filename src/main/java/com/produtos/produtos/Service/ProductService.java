package com.produtos.produtos.Service;

import com.produtos.produtos.Model.Product;
import com.produtos.produtos.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void save(Product product) {
        productRepository.save(product);
    }

    public void update(Product product) {
        productRepository.save(product);
    }

    public void delete(Long id){
        productRepository.deleteById(id);
    }
}
