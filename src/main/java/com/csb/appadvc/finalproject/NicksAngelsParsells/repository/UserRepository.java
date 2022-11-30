package com.csb.appadvc.finalproject.NicksAngelsParsells.repository;

import com.csb.appadvc.finalproject.NicksAngelsParsells.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmailAddress(String emailAddress);

}