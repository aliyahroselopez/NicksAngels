package com.csb.appadvc.finalproject.NicksAngelsParsells.services.impl;

import com.csb.appadvc.finalproject.NicksAngelsParsells.repository.RoleRepository;
import com.csb.appadvc.finalproject.NicksAngelsParsells.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Long getRoleId(String name) {
        return roleRepository.findByName(name).getId();
    }

}
