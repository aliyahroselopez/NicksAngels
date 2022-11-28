package com.csb.appadvc.finalproject.NicksAngelsParsells.services;

import com.csb.appadvc.finalproject.NicksAngelsParsells.dto.ProductDTO;

public interface ProductService {

    Object list();

    void add(ProductDTO product);
}
