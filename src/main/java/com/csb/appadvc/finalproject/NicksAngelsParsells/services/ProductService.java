package com.csb.appadvc.finalproject.NicksAngelsParsells.services;

import com.csb.appadvc.finalproject.NicksAngelsParsells.dto.ProductDTO;
import java.util.List;

public interface ProductService {
    List<ProductDTO> list();

    void add(ProductDTO productDTO);

    ProductDTO get(Long id);

    void update(ProductDTO productDTO);

    void delete(Long id);
}