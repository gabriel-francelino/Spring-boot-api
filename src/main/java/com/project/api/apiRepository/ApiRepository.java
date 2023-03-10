package com.project.api.apiRepository;

import org.springframework.data.repository.CrudRepository;
import com.project.api.model.Person;
import java.util.List;

public interface ApiRepository extends CrudRepository<Person, Integer> {
    //Person findById(int id);   
    List<Person> findAll();
}
