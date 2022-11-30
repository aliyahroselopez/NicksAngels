package com.csb.appadvc.finalproject.NicksAngelsParsells.services;

import com.csb.appadvc.finalproject.NicksAngelsParsells.dto.ProductDTO;

import java.util.*;

public interface ProductService {

    Object list();

    void add(ProductDTO product);
    
    void update(ProductDTO updatedProduct);
    
    void delete (Long id);

    Object get(Long id);
}
