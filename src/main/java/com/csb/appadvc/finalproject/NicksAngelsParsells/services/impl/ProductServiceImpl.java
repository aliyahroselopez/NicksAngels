package com.csb.appadvc.finalproject.NicksAngelsParsells.services.impl;

import com.csb.appadvc.finalproject.NicksAngelsParsells.dto.ProductDTO;
import com.csb.appadvc.finalproject.NicksAngelsParsells.model.Product;
import com.csb.appadvc.finalproject.NicksAngelsParsells.repository.ProductRepository;
import com.csb.appadvc.finalproject.NicksAngelsParsells.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDTO> list() {
        return StreamSupport.stream(productRepository.findAll().spliterator(), false)
                .map(ProductDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public void add(ProductDTO productDTO) {
        productRepository.save(new Product(productDTO));
    }

    @Override
    public ProductDTO get(Long id) {
        return new ProductDTO(productRepository.findById(id).get());
    }

    @Override
    public void update(ProductDTO productDTO) {
        productRepository.save(new Product(productDTO));
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
