package com.vyatsu.task14.services;
//import com.vyatsu.task14.specifications.ProductSpecs;
import org.springframework.data.jpa.domain.Specification;
import com.vyatsu.task14.entities.Product;
import com.vyatsu.task14.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> getAllProducts() {
        Specification<Product> specification = Specification.where(null);
        return productRepository.findAll(specification, PageRequest.of(0,5)).getContent();
    }

    public void add(Product product) {
        productRepository.save(product);
    }
    public void delete(Long id) {
        productRepository.deleteById(id);
    }


}
