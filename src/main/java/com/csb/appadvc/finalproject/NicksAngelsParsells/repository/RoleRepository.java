package com.csb.appadvc.finalproject.NicksAngelsParsells.repository;

import com.csb.appadvc.finalproject.NicksAngelsParsells.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long>  {

    Role findByName(String name);

}

